package com.litte.weatherforecast;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.litte.weatherforecast.adapter.WeatherAdapter;
import com.litte.weatherforecast.entity.WeatherBean;
import com.litte.weatherforecast.manager.HttpWeatherManager;
import com.natasa.progressviews.CircleSegmentBar;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    //主布局控件
    @BindView(R.id.drawer_Layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.swipeRefresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.recycler_View)
    RecyclerView recyclerView;
    @BindView(R.id.navigation_View)
    NavigationView navigationView;
    //标题栏控件
    @BindView(R.id.imageView_title_side)
    ImageView imageView_title_side;
    @BindView(R.id.imageView_title_statics)
    ImageView imageView_title_statics;
    @BindView(R.id.textView_title_cityName)
    TextView textView_title_cityName;
    //适配器
    WeatherAdapter adapter = null;
    //初始化 realtime_weather_layout控件
    @BindView(R.id.textView_realtime_update_time)
    TextView textView_realtime_update_time;
    @BindView(R.id.circleSegmentBar_realtime_weather)
    CircleSegmentBar circleSegmentBar;
    @BindView(R.id.textView_realtime_show_week)
    TextView textView_realtime_show_week;
    @BindView(R.id.textView_realtime_weather_quality)
    TextView textView_realtime_weather_quality;
    Handler handler ;
    Runnable runnable;
    //绑定图标折线图的 控件
    @BindView(R.id.frameLayout_chart)
    FrameLayout frameLayout_chart;

    List<WeatherBean.ResultBean.DataBean.WeatherBeanX> weathers = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialTitleBarColor();
        initialRealTimeWeather();
        setListener();
    }

    private void initialRealTimeWeather() {
        //初始化当天的天信息
        circleSegmentBar.setCircleViewPadding(5);
        circleSegmentBar.setWidth(250);
        circleSegmentBar.setWidthProgressBackground(30);
        circleSegmentBar.setWidthProgressBarLine(25);
        circleSegmentBar.setStartPositionInDegrees(90);
        circleSegmentBar.setLinearGradientProgress(true);
    }

    private void setListener() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(MainActivity.this, "你选择了"+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                String cityName = item.getTitle().toString();
                textView_title_cityName.setText(cityName);
                refreshWeather(cityName,true);
                drawerLayout.closeDrawer(Gravity.LEFT);
                return true;
            }
        });
    }

    private void initialTitleBarColor() {
        handler = new Handler();
        //实例化适配器
        adapter = new WeatherAdapter(this);
        imageView_title_side.setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
        imageView_title_statics.setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
        //侧滑菜单导航栏小图标着色
        navigationView.setItemIconTintList(null);
        //定义一个布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //recyclerView绑定布局管理器
        recyclerView.setLayoutManager(manager);
        //recyclerView绑定适配器
        recyclerView.setAdapter(adapter);
    }
    //加载数据 并实现数据的刷新

    /**
     *
     * @param cityName 城市名称
     * @param isClean   是否清空原有数据
     */
    public void refreshWeather(String cityName, final boolean isClean){
        //加载天气数据
        HttpWeatherManager.loadWeather(this, cityName, new HttpWeatherManager.WeatherLoadListener() {
            @Override
            public void onWeatherLoadEnd(WeatherBean weatherBean) {
                List<WeatherBean.ResultBean.DataBean.WeatherBeanX> weatherStatus = weatherBean.getResult().getData().getWeather();
                MainActivity.this.weathers = weatherStatus;
                //将数据加载入布局
                adapter.addWeathers(weatherStatus,isClean);

                //天气更新时间
                String upDate = weatherBean.getResult().getData().getRealtime().getDate();
                String updateTime = weatherBean.getResult().getData().getRealtime().getTime();
                textView_realtime_update_time.setText("更新时间："+upDate+"-"+updateTime);
                String weekDay = weatherBean.getResult().getData().getRealtime().getWeek();
                String week = switchWeekDay(weekDay);
                textView_realtime_show_week.setText(week);
                String weather_status = weatherBean.getResult().getData().getRealtime().getWeather().getInfo();
                String weather_quality = weatherBean.getResult().getData().getPm25().getPm25().getQuality();
                textView_realtime_weather_quality.setText(weather_status+"|空气质量："+weather_quality);
                //获取实时温度并将其应用在圆形进度条上
                int temperature = Integer.parseInt(weatherBean.getResult().getData().getRealtime().getWeather().getTemperature());
                Log.i("TAG", "onWeatherLoadEnd: temperature:"+temperature);
                setTemperatureToBar(temperature);
            }
        });
    }

    private void setTemperatureToBar(final int temperature) {
        handler.removeCallbacksAndMessages(null);
        runnable = new Runnable() {
            int progress = 0;
            @Override
            public void run() {
                progress++;
                if (progress<100*temperature/50){
                    circleSegmentBar.setProgress((float) progress);
                    circleSegmentBar.setText("实时温度："+temperature+"℃");
                }
                handler.postDelayed(runnable,1000);
            }
        };
        handler.postDelayed(runnable,1000);
    }

    private String switchWeekDay(String weekDay) {
        String week = "";
        switch (weekDay){
            case "1":
                week = "星期一";
                break;
            case "2":
                week = "星期二";
                break;
            case "3":
                week = "星期三";
                break;
            case "4":
                week = "星期四";
                break;
            case "5":
                week = "星期五";
                break;
            case "6":
                week = "星期六";
                break;
            case "7":
                week = "星期日";
                break;
            default:
                break;
        }
        return week;
    }

    //侧滑菜单点击事件
    @OnClick(R.id.imageView_title_side)
    public void onClick_imageViewTitle_Side(){
        if (!drawerLayout.isDrawerOpen(Gravity.LEFT)){
            drawerLayout.openDrawer(Gravity.LEFT);
        }else {
            drawerLayout.closeDrawer(Gravity.LEFT);
        }
    }
    //图表的点击事件
    @OnClick(R.id.imageView_title_statics)
    public void onClick_imageViewTitle_Statics(){
//        Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show();
        //获得布局的可见性
        int visibility = frameLayout_chart.getVisibility();
        if (visibility == View.INVISIBLE){
            frameLayout_chart.setVisibility(View.VISIBLE);
            //获得图片对象
            GraphicalView view = ChartFactory.getLineChartView(this,getDataset(),getRender());
            //把图标添加到布局中
            frameLayout_chart.addView(view);
        }else {
            frameLayout_chart.setVisibility(View.INVISIBLE);
        }
    }
    //绘制天气变化的折线图
    /*
    * 1、创建总的数据的系列
    * 2、分别为白天和夜晚温度创建子数据系列
    * 3、创建总的渲染器
    * 4、分别为两条线创建子渲染器
    * */
    public XYMultipleSeriesDataset getDataset(){
        XYMultipleSeriesDataset dataSet = new XYMultipleSeriesDataset();
        String[] title = {"白天温度","夜晚温度"};
        //构建X轴的数据源----第一天。。。。。第五天
        List<double[]> x = new ArrayList<>();
        for (int i = 0;i<title.length;i++){
            double[] day = new double[]{1,2,3,4,5};
            x.add(day);
        }
        //构建Y轴的数据源----白天和夜晚的温度集
        List<double[]> y = new ArrayList<>();
        double[] days = new double[5];
        double[] nights = new double[5];
        for (int i = 0;i<weathers.size();i++){
            days[i] = Double.parseDouble(weathers.get(i).getInfo().getDay().get(2));
            nights[i] = Double.parseDouble(weathers.get(i).getInfo().getNight().get(2));
        }
        //将数组添加到集合中
        y.add(days);
        y.add(nights);
        //创建两个数据系列再把数据加载到数据系列中
        for (int i=0;i<title.length;i++){
            XYSeries series = new XYSeries(title[i]);
            //创建坐标点
            double[] xv = x.get(i);
            double[] yv = y.get(i);
            for (int j = 0;j<xv.length;j++){
                series.add(xv[j],yv[j]);
            }
            //把数据序列加到总的集合中
            dataSet.addSeries(series);
        }
        return dataSet;
    }

    //渲染
    public XYMultipleSeriesRenderer getRender(){
        XYMultipleSeriesRenderer render = new XYMultipleSeriesRenderer();
        int[] colors = {Color.GREEN,Color.YELLOW};
        //定义拐点的样式
        PointStyle[] styles = new PointStyle[]{PointStyle.CIRCLE,PointStyle.SQUARE};

        //X轴标签的的各数为5
        render.setXLabels(5);
        render.setShowGrid(true);
        //设置轴标签的对齐方式
        render.setXLabelsAlign(Paint.Align.RIGHT);
        render.setYLabelsAlign(Paint.Align.RIGHT);
        //设置整个图标的标题
        render.setChartTitle("温度走势图");
        render.setXTitle("未来五天");
        render.setYTitle("温度");
        render.setChartTitleTextSize(48);
        render.setAxisTitleTextSize(30);
        render.setLabelsTextSize(30);
        render.setLegendTextSize(28);

        render.setYLabels(6);
//        render.setYLabels(8);
        render.setXAxisMin(0.5);
        render.setXAxisMax(7.5);
        render.setYAxisMax(50);
        render.setYAxisMin(-20);
        //设置坐标轴的颜色
        render.setAxesColor(Color.LTGRAY);
        //设置标签文本的颜色
        render.setLabelsColor(Color.LTGRAY);
        //设置拐点的大小
        render.setPointSize(8f);
        render.setMargins(new int[]{50,50,15,30});
        int length = colors.length;
        for (int i = 0;i<length;i++){
            XYSeriesRenderer r = new XYSeriesRenderer();
            r.setLineWidth(5);
            r.setColor(colors[i]);
            r.setFillPoints(true);
            r.setPointStyle(styles[i]);
            //把自渲染器加到主渲染中
            render.addSeriesRenderer(r);
        }
        return render;
    }
    @Override
    protected void onResume() {
        super.onResume();
        //获得当前城市名字
        String CityName = textView_title_cityName.getText().toString();
        refreshWeather(CityName,true);
    }
}
