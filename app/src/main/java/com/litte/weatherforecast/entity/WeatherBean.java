package com.litte.weatherforecast.entity;

import java.util.List;

/**
 * Created by litte on 2018/1/10.
 */

public class WeatherBean {
    /**
     * reason : 查询成功!
     * result : {"data":{"realtime":{"city_code":"101020100","city_name":"上海","date":"2018-01-11","time":"09:06:01","week":"4","moon":"十一月廿五","dataUptime":1515632761,"weather":{"temperature":"0","humidity":"54","info":"晴","img":"00"},"wind":{"direct":"西风","power":"1级","offset":"","windspeed":""}},"life":{"date":"2018-01-11","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"guomin":["极不易发","天气条件极不易诱发过敏，可放心外出，享受生活。"],"shushidu":["较不舒适","白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"],"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"diaoyu":["较适宜","较适合垂钓，但天气稍凉，会对垂钓产生一定的影响。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"daisan":["不带伞","天气较好，您在出门的时候无须带雨伞。"]}},"weather":[{"date":"2018-01-11","info":{"dawn":["0","晴","-1","西北风","微风","17:09"],"day":["0","晴","5","西北风","3-5级","06:54"],"night":["0","晴","-2","西北风","微风","17:10"]},"week":"四","nongli":"十一月廿五"},{"date":"2018-01-12","info":{"dawn":["0","晴","-2","西北风","微风","17:10"],"day":["0","晴","5","西北风","微风","06:54"],"night":["0","晴","0","西北风","微风","17:10"]},"week":"五","nongli":"十一月廿六"},{"date":"2018-01-13","info":{"dawn":["0","晴","0","西北风","微风","17:10"],"day":["0","晴","8","东北风","微风","06:54"],"night":["1","多云","2","东风","微风","17:11"]},"week":"六","nongli":"十一月廿七"},{"date":"2018-01-14","info":{"dawn":["1","多云","2","东风","微风","17:11"],"day":["1","多云","11","东南风","微风","06:54"],"night":["1","多云","5","东南风","微风","17:12"]},"week":"日","nongli":"十一月廿八"},{"date":"2018-01-15","info":{"dawn":["1","多云","5","东南风","微风","17:12"],"day":["1","多云","18","东南风","3-5级","06:54"],"night":["7","小雨","12","东南风","4-5级","17:13"]},"week":"一","nongli":"十一月廿九"}],"f3h":{"temperature":[{"jg":"20180111080000","jb":"0"},{"jg":"20180111110000","jb":"4"},{"jg":"20180111140000","jb":"4"},{"jg":"20180111170000","jb":"3"},{"jg":"20180111200000","jb":"1"},{"jg":"20180111230000","jb":"0"},{"jg":"20180112020000","jb":"0"},{"jg":"20180112050000","jb":"-1"},{"jg":"20180112080000","jb":"-1"}],"precipitation":[{"jg":"20180111080000","jf":"0"},{"jg":"20180111110000","jf":"0"},{"jg":"20180111140000","jf":"0"},{"jg":"20180111170000","jf":"0"},{"jg":"20180111200000","jf":"0"},{"jg":"20180111230000","jf":"0"},{"jg":"20180112020000","jf":"0"},{"jg":"20180112050000","jf":"0"},{"jg":"20180112080000","jf":"0"}]},"pm25":{"pm25":{"level":2,"quality":"良","des":"空气良好，可以正常参加户外活动。","curPm":"59","pm25":"39","pm10":"66","pub_time":1515618000,"city_code":"101020100"},"cityName":"上海","key":"上海","dateTime":"2018年01月11日05时"},"jingqu":"","jingqutq":"","date":"","isForeign":"0","partner":{"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://j.www.haosou.com/?u=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101020100&m=633a2d&from=juhe&type=weather"}}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : {"realtime":{"city_code":"101020100","city_name":"上海","date":"2018-01-11","time":"09:06:01","week":"4","moon":"十一月廿五","dataUptime":1515632761,"weather":{"temperature":"0","humidity":"54","info":"晴","img":"00"},"wind":{"direct":"西风","power":"1级","offset":"","windspeed":""}},"life":{"date":"2018-01-11","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"guomin":["极不易发","天气条件极不易诱发过敏，可放心外出，享受生活。"],"shushidu":["较不舒适","白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"],"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"diaoyu":["较适宜","较适合垂钓，但天气稍凉，会对垂钓产生一定的影响。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"daisan":["不带伞","天气较好，您在出门的时候无须带雨伞。"]}},"weather":[{"date":"2018-01-11","info":{"dawn":["0","晴","-1","西北风","微风","17:09"],"day":["0","晴","5","西北风","3-5级","06:54"],"night":["0","晴","-2","西北风","微风","17:10"]},"week":"四","nongli":"十一月廿五"},{"date":"2018-01-12","info":{"dawn":["0","晴","-2","西北风","微风","17:10"],"day":["0","晴","5","西北风","微风","06:54"],"night":["0","晴","0","西北风","微风","17:10"]},"week":"五","nongli":"十一月廿六"},{"date":"2018-01-13","info":{"dawn":["0","晴","0","西北风","微风","17:10"],"day":["0","晴","8","东北风","微风","06:54"],"night":["1","多云","2","东风","微风","17:11"]},"week":"六","nongli":"十一月廿七"},{"date":"2018-01-14","info":{"dawn":["1","多云","2","东风","微风","17:11"],"day":["1","多云","11","东南风","微风","06:54"],"night":["1","多云","5","东南风","微风","17:12"]},"week":"日","nongli":"十一月廿八"},{"date":"2018-01-15","info":{"dawn":["1","多云","5","东南风","微风","17:12"],"day":["1","多云","18","东南风","3-5级","06:54"],"night":["7","小雨","12","东南风","4-5级","17:13"]},"week":"一","nongli":"十一月廿九"}],"f3h":{"temperature":[{"jg":"20180111080000","jb":"0"},{"jg":"20180111110000","jb":"4"},{"jg":"20180111140000","jb":"4"},{"jg":"20180111170000","jb":"3"},{"jg":"20180111200000","jb":"1"},{"jg":"20180111230000","jb":"0"},{"jg":"20180112020000","jb":"0"},{"jg":"20180112050000","jb":"-1"},{"jg":"20180112080000","jb":"-1"}],"precipitation":[{"jg":"20180111080000","jf":"0"},{"jg":"20180111110000","jf":"0"},{"jg":"20180111140000","jf":"0"},{"jg":"20180111170000","jf":"0"},{"jg":"20180111200000","jf":"0"},{"jg":"20180111230000","jf":"0"},{"jg":"20180112020000","jf":"0"},{"jg":"20180112050000","jf":"0"},{"jg":"20180112080000","jf":"0"}]},"pm25":{"pm25":{"level":2,"quality":"良","des":"空气良好，可以正常参加户外活动。","curPm":"59","pm25":"39","pm10":"66","pub_time":1515618000,"city_code":"101020100"},"cityName":"上海","key":"上海","dateTime":"2018年01月11日05时"},"jingqu":"","jingqutq":"","date":"","isForeign":"0","partner":{"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://j.www.haosou.com/?u=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101020100&m=633a2d&from=juhe&type=weather"}}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * realtime : {"city_code":"101020100","city_name":"上海","date":"2018-01-11","time":"09:06:01","week":"4","moon":"十一月廿五","dataUptime":1515632761,"weather":{"temperature":"0","humidity":"54","info":"晴","img":"00"},"wind":{"direct":"西风","power":"1级","offset":"","windspeed":""}}
             * life : {"date":"2018-01-11","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"guomin":["极不易发","天气条件极不易诱发过敏，可放心外出，享受生活。"],"shushidu":["较不舒适","白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"],"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"diaoyu":["较适宜","较适合垂钓，但天气稍凉，会对垂钓产生一定的影响。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"daisan":["不带伞","天气较好，您在出门的时候无须带雨伞。"]}}
             * weather : [{"date":"2018-01-11","info":{"dawn":["0","晴","-1","西北风","微风","17:09"],"day":["0","晴","5","西北风","3-5级","06:54"],"night":["0","晴","-2","西北风","微风","17:10"]},"week":"四","nongli":"十一月廿五"},{"date":"2018-01-12","info":{"dawn":["0","晴","-2","西北风","微风","17:10"],"day":["0","晴","5","西北风","微风","06:54"],"night":["0","晴","0","西北风","微风","17:10"]},"week":"五","nongli":"十一月廿六"},{"date":"2018-01-13","info":{"dawn":["0","晴","0","西北风","微风","17:10"],"day":["0","晴","8","东北风","微风","06:54"],"night":["1","多云","2","东风","微风","17:11"]},"week":"六","nongli":"十一月廿七"},{"date":"2018-01-14","info":{"dawn":["1","多云","2","东风","微风","17:11"],"day":["1","多云","11","东南风","微风","06:54"],"night":["1","多云","5","东南风","微风","17:12"]},"week":"日","nongli":"十一月廿八"},{"date":"2018-01-15","info":{"dawn":["1","多云","5","东南风","微风","17:12"],"day":["1","多云","18","东南风","3-5级","06:54"],"night":["7","小雨","12","东南风","4-5级","17:13"]},"week":"一","nongli":"十一月廿九"}]
             * f3h : {"temperature":[{"jg":"20180111080000","jb":"0"},{"jg":"20180111110000","jb":"4"},{"jg":"20180111140000","jb":"4"},{"jg":"20180111170000","jb":"3"},{"jg":"20180111200000","jb":"1"},{"jg":"20180111230000","jb":"0"},{"jg":"20180112020000","jb":"0"},{"jg":"20180112050000","jb":"-1"},{"jg":"20180112080000","jb":"-1"}],"precipitation":[{"jg":"20180111080000","jf":"0"},{"jg":"20180111110000","jf":"0"},{"jg":"20180111140000","jf":"0"},{"jg":"20180111170000","jf":"0"},{"jg":"20180111200000","jf":"0"},{"jg":"20180111230000","jf":"0"},{"jg":"20180112020000","jf":"0"},{"jg":"20180112050000","jf":"0"},{"jg":"20180112080000","jf":"0"}]}
             * pm25 : {"pm25":{"level":2,"quality":"良","des":"空气良好，可以正常参加户外活动。","curPm":"59","pm25":"39","pm10":"66","pub_time":1515618000,"city_code":"101020100"},"cityName":"上海","key":"上海","dateTime":"2018年01月11日05时"}
             * jingqu :
             * jingqutq :
             * date :
             * isForeign : 0
             * partner : {"title_word":"全国","show_url":"tianqi.so.com","base_url":"http://j.www.haosou.com/?u=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101020100&m=633a2d&from=juhe&type=weather"}
             */

            private RealtimeBean realtime;
            private LifeBean life;
            private F3hBean f3h;
            private Pm25BeanX pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            private PartnerBean partner;
            private List<WeatherBeanX> weather;

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public F3hBean getF3h() {
                return f3h;
            }

            public void setF3h(F3hBean f3h) {
                this.f3h = f3h;
            }

            public Pm25BeanX getPm25() {
                return pm25;
            }

            public void setPm25(Pm25BeanX pm25) {
                this.pm25 = pm25;
            }

            public String getJingqu() {
                return jingqu;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public PartnerBean getPartner() {
                return partner;
            }

            public void setPartner(PartnerBean partner) {
                this.partner = partner;
            }

            public List<WeatherBeanX> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBeanX> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                /**
                 * city_code : 101020100
                 * city_name : 上海
                 * date : 2018-01-11
                 * time : 09:06:01
                 * week : 4
                 * moon : 十一月廿五
                 * dataUptime : 1515632761
                 * weather : {"temperature":"0","humidity":"54","info":"晴","img":"00"}
                 * wind : {"direct":"西风","power":"1级","offset":"","windspeed":""}
                 */

                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private String week;
                private String moon;
                private int dataUptime;
                private WeatherBeanXX weather;
                private WindBean wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public WeatherBeanXX getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBeanXX weather) {
                    this.weather = weather;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class WeatherBeanXX {
                    /**
                     * temperature : 0
                     * humidity : 54
                     * info : 晴
                     * img : 00
                     */

                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class WindBean {
                    /**
                     * direct : 西风
                     * power : 1级
                     * offset :
                     * windspeed :
                     */

                    private String direct;
                    private String power;
                    private String offset;
                    private String windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public String getOffset() {
                        return offset;
                    }

                    public void setOffset(String offset) {
                        this.offset = offset;
                    }

                    public String getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(String windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class LifeBean {
                /**
                 * date : 2018-01-11
                 * info : {"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"guomin":["极不易发","天气条件极不易诱发过敏，可放心外出，享受生活。"],"shushidu":["较不舒适","白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"],"chuanyi":["冷","天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"],"diaoyu":["较适宜","较适合垂钓，但天气稍凉，会对垂钓产生一定的影响。"],"ganmao":["易发","昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，但考虑天气寒冷，推荐您进行各种室内运动，若在户外运动请注意保暖并做好准备活动。"],"daisan":["不带伞","天气较好，您在出门的时候无须带雨伞。"]}
                 */

                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> kongtiao;
                    private List<String> guomin;
                    private List<String> shushidu;
                    private List<String> chuanyi;
                    private List<String> diaoyu;
                    private List<String> ganmao;
                    private List<String> ziwaixian;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> daisan;

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getGuomin() {
                        return guomin;
                    }

                    public void setGuomin(List<String> guomin) {
                        this.guomin = guomin;
                    }

                    public List<String> getShushidu() {
                        return shushidu;
                    }

                    public void setShushidu(List<String> shushidu) {
                        this.shushidu = shushidu;
                    }

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getDiaoyu() {
                        return diaoyu;
                    }

                    public void setDiaoyu(List<String> diaoyu) {
                        this.diaoyu = diaoyu;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getDaisan() {
                        return daisan;
                    }

                    public void setDaisan(List<String> daisan) {
                        this.daisan = daisan;
                    }
                }
            }

            public static class F3hBean {
                private List<TemperatureBean> temperature;
                private List<PrecipitationBean> precipitation;

                public List<TemperatureBean> getTemperature() {
                    return temperature;
                }

                public void setTemperature(List<TemperatureBean> temperature) {
                    this.temperature = temperature;
                }

                public List<PrecipitationBean> getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(List<PrecipitationBean> precipitation) {
                    this.precipitation = precipitation;
                }

                public static class TemperatureBean {
                    /**
                     * jg : 20180111080000
                     * jb : 0
                     */

                    private String jg;
                    private String jb;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJb() {
                        return jb;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }

                public static class PrecipitationBean {
                    /**
                     * jg : 20180111080000
                     * jf : 0
                     */

                    private String jg;
                    private String jf;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJf() {
                        return jf;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }

            public static class Pm25BeanX {
                /**
                 * pm25 : {"level":2,"quality":"良","des":"空气良好，可以正常参加户外活动。","curPm":"59","pm25":"39","pm10":"66","pub_time":1515618000,"city_code":"101020100"}
                 * cityName : 上海
                 * key : 上海
                 * dateTime : 2018年01月11日05时
                 */

                private Pm25Bean pm25;
                private String cityName;
                private String key;
                private String dateTime;

                public Pm25Bean getPm25() {
                    return pm25;
                }

                public void setPm25(Pm25Bean pm25) {
                    this.pm25 = pm25;
                }

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public static class Pm25Bean {
                    /**
                     * level : 2
                     * quality : 良
                     * des : 空气良好，可以正常参加户外活动。
                     * curPm : 59
                     * pm25 : 39
                     * pm10 : 66
                     * pub_time : 1515618000
                     * city_code : 101020100
                     */

                    private int level;
                    private String quality;
                    private String des;
                    private String curPm;
                    private String pm25;
                    private String pm10;
                    private int pub_time;
                    private String city_code;

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    public String getDes() {
                        return des;
                    }

                    public void setDes(String des) {
                        this.des = des;
                    }

                    public String getCurPm() {
                        return curPm;
                    }

                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public int getPub_time() {
                        return pub_time;
                    }

                    public void setPub_time(int pub_time) {
                        this.pub_time = pub_time;
                    }

                    public String getCity_code() {
                        return city_code;
                    }

                    public void setCity_code(String city_code) {
                        this.city_code = city_code;
                    }
                }
            }

            public static class PartnerBean {
                /**
                 * title_word : 全国
                 * show_url : tianqi.so.com
                 * base_url : http://j.www.haosou.com/?u=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101020100&m=633a2d&from=juhe&type=weather
                 */

                private String title_word;
                private String show_url;
                private String base_url;

                public String getTitle_word() {
                    return title_word;
                }

                public void setTitle_word(String title_word) {
                    this.title_word = title_word;
                }

                public String getShow_url() {
                    return show_url;
                }

                public void setShow_url(String show_url) {
                    this.show_url = show_url;
                }

                public String getBase_url() {
                    return base_url;
                }

                public void setBase_url(String base_url) {
                    this.base_url = base_url;
                }
            }

            public static class WeatherBeanX {
                /**
                 * date : 2018-01-11
                 * info : {"dawn":["0","晴","-1","西北风","微风","17:09"],"day":["0","晴","5","西北风","3-5级","06:54"],"night":["0","晴","-2","西北风","微风","17:10"]}
                 * week : 四
                 * nongli : 十一月廿五
                 */

                private String date;
                private InfoBeanX info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBeanX getInfo() {
                    return info;
                }

                public void setInfo(InfoBeanX info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBeanX {
                    private List<String> dawn;
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDawn() {
                        return dawn;
                    }

                    public void setDawn(List<String> dawn) {
                        this.dawn = dawn;
                    }

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }


   /* *//**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"-1","wind_direction":"西北风","wind_strength":"3级","humidity":"16%","time":"13:29"},"today":{"temperature":"-10℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西北风4-5 级","week":"星期三","city":"北京","date_y":"2018年01月10日","dressing_index":"寒冷","dressing_advice":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","uv_index":"弱","comfort_index":"","wash_index":"较不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":{"day_20180110":{"temperature":"-10℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西北风4-5 级","week":"星期三","date":"20180110"},"day_20180111":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期四","date":"20180111"},"day_20180112":{"temperature":"-9℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20180112"},"day_20180113":{"temperature":"-7℃~3℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期六","date":"20180113"},"day_20180114":{"temperature":"-6℃~5℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西风微风","week":"星期日","date":"20180114"},"day_20180115":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期一","date":"20180115"},"day_20180116":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期二","date":"20180116"}}}
     * error_code : 0
     *//*

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        *//**
         * sk : {"temp":"-1","wind_direction":"西北风","wind_strength":"3级","humidity":"16%","time":"13:29"}
         * today : {"temperature":"-10℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西北风4-5 级","week":"星期三","city":"北京","date_y":"2018年01月10日","dressing_index":"寒冷","dressing_advice":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","uv_index":"弱","comfort_index":"","wash_index":"较不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
         * future : {"day_20180110":{"temperature":"-10℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西北风4-5 级","week":"星期三","date":"20180110"},"day_20180111":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期四","date":"20180111"},"day_20180112":{"temperature":"-9℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20180112"},"day_20180113":{"temperature":"-7℃~3℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期六","date":"20180113"},"day_20180114":{"temperature":"-6℃~5℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西风微风","week":"星期日","date":"20180114"},"day_20180115":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期一","date":"20180115"},"day_20180116":{"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期二","date":"20180116"}}
         *//*

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            *//**
             * temp : -1
             * wind_direction : 西北风
             * wind_strength : 3级
             * humidity : 16%
             * time : 13:29
             *//*

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            *//**
             * temperature : -10℃~-2℃
             * weather : 晴
             * weather_id : {"fa":"00","fb":"00"}
             * wind : 西北风4-5 级
             * week : 星期三
             * city : 北京
             * date_y : 2018年01月10日
             * dressing_index : 寒冷
             * dressing_advice : 天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。
             * uv_index : 弱
             * comfort_index :
             * wash_index : 较不宜
             * travel_index : 较不宜
             * exercise_index : 较不宜
             * drying_index :
             *//*

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                *//**
                 * fa : 00
                 * fb : 00
                 *//*

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            *//**
             * day_20180110 : {"temperature":"-10℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西北风4-5 级","week":"星期三","date":"20180110"}
             * day_20180111 : {"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期四","date":"20180111"}
             * day_20180112 : {"temperature":"-9℃~2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20180112"}
             * day_20180113 : {"temperature":"-7℃~3℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期六","date":"20180113"}
             * day_20180114 : {"temperature":"-6℃~5℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西风微风","week":"星期日","date":"20180114"}
             * day_20180115 : {"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期一","date":"20180115"}
             * day_20180116 : {"temperature":"-9℃~-2℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风微风","week":"星期二","date":"20180116"}
             *//*

            private Day20180110Bean day_20180110;
            private Day20180111Bean day_20180111;
            private Day20180112Bean day_20180112;
            private Day20180113Bean day_20180113;
            private Day20180114Bean day_20180114;
            private Day20180115Bean day_20180115;
            private Day20180116Bean day_20180116;

            public Day20180110Bean getDay_20180110() {
                return day_20180110;
            }

            public void setDay_20180110(Day20180110Bean day_20180110) {
                this.day_20180110 = day_20180110;
            }

            public Day20180111Bean getDay_20180111() {
                return day_20180111;
            }

            public void setDay_20180111(Day20180111Bean day_20180111) {
                this.day_20180111 = day_20180111;
            }

            public Day20180112Bean getDay_20180112() {
                return day_20180112;
            }

            public void setDay_20180112(Day20180112Bean day_20180112) {
                this.day_20180112 = day_20180112;
            }

            public Day20180113Bean getDay_20180113() {
                return day_20180113;
            }

            public void setDay_20180113(Day20180113Bean day_20180113) {
                this.day_20180113 = day_20180113;
            }

            public Day20180114Bean getDay_20180114() {
                return day_20180114;
            }

            public void setDay_20180114(Day20180114Bean day_20180114) {
                this.day_20180114 = day_20180114;
            }

            public Day20180115Bean getDay_20180115() {
                return day_20180115;
            }

            public void setDay_20180115(Day20180115Bean day_20180115) {
                this.day_20180115 = day_20180115;
            }

            public Day20180116Bean getDay_20180116() {
                return day_20180116;
            }

            public void setDay_20180116(Day20180116Bean day_20180116) {
                this.day_20180116 = day_20180116;
            }

            public static class Day20180110Bean {
                *//**
                 * temperature : -10℃~-2℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 西北风4-5 级
                 * week : 星期三
                 * date : 20180110
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180111Bean {
                *//**
                 * temperature : -9℃~-2℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 北风微风
                 * week : 星期四
                 * date : 20180111
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180112Bean {
                *//**
                 * temperature : -9℃~2℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 西南风微风
                 * week : 星期五
                 * date : 20180112
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180113Bean {
                *//**
                 * temperature : -7℃~3℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 南风微风
                 * week : 星期六
                 * date : 20180113
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    *//**
                     * fa : 01
                     * fb : 01
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180114Bean {
                *//**
                 * temperature : -6℃~5℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 西风微风
                 * week : 星期日
                 * date : 20180114
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180115Bean {
                *//**
                 * temperature : -9℃~-2℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 北风微风
                 * week : 星期一
                 * date : 20180115
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20180116Bean {
                *//**
                 * temperature : -9℃~-2℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 北风微风
                 * week : 星期二
                 * date : 20180116
                 *//*

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    *//**
                     * fa : 00
                     * fb : 00
                     *//*

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }*/
}
