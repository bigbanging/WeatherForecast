package com.litte.weatherforecast.manager;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.litte.weatherforecast.content.IURL;
import com.litte.weatherforecast.entity.WeatherBean;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by litte on 2018/1/10.
 */

public class HttpWeatherManager {
    // 加载天气数据

    //请求队列
    public static RequestQueue queue = null;
    /**
     *
     * @param context   上下文参数
     * @param cityName  城市名称
     * @param weatherLoadListener
     */
    public static void loadWeather(Context context, String cityName, final WeatherLoadListener weatherLoadListener){

        try {
            cityName = URLEncoder.encode(cityName,"utf8");
            String url = IURL.ROOT+"cityname="+cityName+"&key="+IURL.APPKEY;
            if (queue == null) {
                queue = Volley.newRequestQueue(context);
            }

            StringRequest request = new StringRequest(url, new Response.Listener<String>() {
                @Override
                public void onResponse(String s) {
                    //创建Gson对象
                    Gson gson = new Gson();
                    WeatherBean weatherBean = gson.fromJson(s, WeatherBean.class);
                    //使用接口回掉机制将获取到的数据发送给activity
                    weatherLoadListener.onWeatherLoadEnd(weatherBean);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    Log.i("TAG", "onErrorResponse: volleyError:"+volleyError.getMessage());
                }
            });
            //将请求对象加入到队列中
            queue.add(request);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public interface WeatherLoadListener{
        public void onWeatherLoadEnd(WeatherBean weatherBean);
    }
}
