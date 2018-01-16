package com.litte.weatherforecast.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.litte.weatherforecast.R;
import com.litte.weatherforecast.entity.WeatherBean;
//import com.litte.weatherforecast.entity.WeatherBean.ResultBean.TodayBean.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by litte on 2018/1/10.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private Context context;
    public WeatherAdapter(Context context){
        this.context = context;
    }
   /* "today": {
        "temperature": "-10℃~-2℃",
                "weather": "晴",
                "weather_id": {
            "fa": "00",
                    "fb": "00"
      */
        public List<WeatherBean.ResultBean.DataBean.WeatherBeanX> weathers = new ArrayList<>();
    public void addWeathers(List<WeatherBean.ResultBean.DataBean.WeatherBeanX> weatherList,boolean isClean){
        if (isClean){
            //先清空在添加数据
            this.weathers.clear();
            weathers.addAll(weatherList);
        }else {
            weathers.addAll(weatherList);
        }
        notifyDataSetChanged();
    }
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;
//        View itemView = View.inflate(context,R.layout.inflate_weather_status,parent);
        View view = LayoutInflater.from(context).inflate(R.layout.inflate_weather_status,parent,false);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.ViewHolder holder, int position) {
        //获得要适配的数据对象 WeatherBean.ResultBean.TodayBean.
        WeatherBean.ResultBean.DataBean.WeatherBeanX weatherX = weathers.get(position);
        /** 0是晴天
          * 1是多云
          * 2是阴
          * 3是雨*/
        String weather_status = weatherX.getInfo().getDay().get(0);
        if ("0".equals(weather_status)){
            holder.imageView_Weather_status_picture.setImageResource(R.drawable.sunny);
        }else if ("1".equals(weather_status)){
            holder.imageView_Weather_status_picture.setImageResource(R.drawable.cloudy);
        }else if ("2".equals(weather_status)){
            holder.imageView_Weather_status_picture.setImageResource(R.drawable.lotcloudy);
        }else {
            holder.imageView_Weather_status_picture.setImageResource(R.drawable.rain);
        }
        String weather_describe = weatherX.getInfo().getDay().get(1);
        holder.textView_Weather_status_describe.setText(weather_describe);
        String dayTemperature = weatherX.getInfo().getDay().get(2);
        String nightTemperature = weatherX.getInfo().getNight().get(2);
        holder.textView_Weather_status_temperature.setText(dayTemperature+"℃"+"--"+nightTemperature+"℃");
        String weather_week = weatherX.getWeek();
        holder.textView_Weather_status_week.setText("星期"+weather_week);
    }

    @Override
    public int getItemCount() {
        return weathers.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView_Weather_status_picture;
        TextView textView_Weather_status_describe;
        TextView textView_Weather_status_temperature;
        TextView textView_Weather_status_week;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView_Weather_status_picture = itemView.findViewById(R.id.imageView_Weather_status_picture);
            textView_Weather_status_describe = itemView.findViewById(R.id.textView_Weather_status_describe);
            textView_Weather_status_temperature = itemView.findViewById(R.id.textView_Weather_status_temperature);
            textView_Weather_status_week = itemView.findViewById(R.id.textView_Weather_status_week);
        }
    }
}
