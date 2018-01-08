package com.wjk32.jweather.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wjk32 on 1/7/2018.
 */

public class Weather {

    /**
     * cod : 200
     * message : 0.005
     * cnt : 40
     * list : [{"dt":1515369600,"main":{"temp":260.78,"temp_min":258.811,"temp_max":260.78,"pressure":1008.38,"sea_level":1045.71,"grnd_level":1008.38,"humidity":72,"temp_kf":1.96},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":2.21,"deg":217.003},"sys":{"pod":"n"},"dt_txt":"2018-01-08 00:00:00"},{"dt":1515380400,"main":{"temp":260.55,"temp_min":259.24,"temp_max":260.55,"pressure":1007.09,"sea_level":1044.3,"grnd_level":1007.09,"humidity":70,"temp_kf":1.31},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":2.31,"deg":221.5},"sys":{"pod":"n"},"dt_txt":"2018-01-08 03:00:00"},{"dt":1515391200,"main":{"temp":260.31,"temp_min":259.66,"temp_max":260.31,"pressure":1005.5,"sea_level":1042.61,"grnd_level":1005.5,"humidity":67,"temp_kf":0.65},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":2.11,"deg":228},"sys":{"pod":"n"},"dt_txt":"2018-01-08 06:00:00"},{"dt":1515402000,"main":{"temp":257.366,"temp_min":257.366,"temp_max":257.366,"pressure":1003.97,"sea_level":1041.01,"grnd_level":1003.97,"humidity":72,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.35,"deg":200.5},"sys":{"pod":"n"},"dt_txt":"2018-01-08 09:00:00"},{"dt":1515412800,"main":{"temp":257.464,"temp_min":257.464,"temp_max":257.464,"pressure":1002.84,"sea_level":1039.78,"grnd_level":1002.84,"humidity":71,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":76},"wind":{"speed":1.21,"deg":180},"sys":{"pod":"n"},"dt_txt":"2018-01-08 12:00:00"},{"dt":1515423600,"main":{"temp":263.162,"temp_min":263.162,"temp_max":263.162,"pressure":1002.37,"sea_level":1038.78,"grnd_level":1002.37,"humidity":67,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":1.57,"deg":201.505},"sys":{"pod":"d"},"dt_txt":"2018-01-08 15:00:00"},{"dt":1515434400,"main":{"temp":266.974,"temp_min":266.974,"temp_max":266.974,"pressure":998.49,"sea_level":1034.3,"grnd_level":998.49,"humidity":75,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":76},"wind":{"speed":2.07,"deg":206.5},"snow":{"3h":0.195},"sys":{"pod":"d"},"dt_txt":"2018-01-08 18:00:00"},{"dt":1515445200,"main":{"temp":268.028,"temp_min":268.028,"temp_max":268.028,"pressure":997.25,"sea_level":1032.79,"grnd_level":997.25,"humidity":88,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":92},"wind":{"speed":2.36,"deg":227.002},"snow":{"3h":1.385},"sys":{"pod":"d"},"dt_txt":"2018-01-08 21:00:00"},{"dt":1515456000,"main":{"temp":267.468,"temp_min":267.468,"temp_max":267.468,"pressure":997.61,"sea_level":1033.12,"grnd_level":997.61,"humidity":92,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":56},"wind":{"speed":2.57,"deg":232.5},"snow":{"3h":0.04},"sys":{"pod":"n"},"dt_txt":"2018-01-09 00:00:00"},{"dt":1515466800,"main":{"temp":267.953,"temp_min":267.953,"temp_max":267.953,"pressure":997,"sea_level":1032.52,"grnd_level":997,"humidity":88,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.52,"deg":235.5},"snow":{"3h":0.025},"sys":{"pod":"n"},"dt_txt":"2018-01-09 03:00:00"},{"dt":1515477600,"main":{"temp":268.403,"temp_min":268.403,"temp_max":268.403,"pressure":995.97,"sea_level":1031.47,"grnd_level":995.97,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":12},"wind":{"speed":2.67,"deg":241.502},"snow":{"3h":0.02},"sys":{"pod":"n"},"dt_txt":"2018-01-09 06:00:00"},{"dt":1515488400,"main":{"temp":269.89,"temp_min":269.89,"temp_max":269.89,"pressure":995.84,"sea_level":1031.3,"grnd_level":995.84,"humidity":93,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":12},"wind":{"speed":2.45,"deg":261.501},"snow":{"3h":0.06},"sys":{"pod":"n"},"dt_txt":"2018-01-09 09:00:00"},{"dt":1515499200,"main":{"temp":268.213,"temp_min":268.213,"temp_max":268.213,"pressure":997.68,"sea_level":1033.25,"grnd_level":997.68,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.76,"deg":290.001},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-09 12:00:00"},{"dt":1515510000,"main":{"temp":270.876,"temp_min":270.876,"temp_max":270.876,"pressure":1000.9,"sea_level":1036.53,"grnd_level":1000.9,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.11,"deg":305.504},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-09 15:00:00"},{"dt":1515520800,"main":{"temp":272.999,"temp_min":272.999,"temp_max":272.999,"pressure":1001.6,"sea_level":1036.99,"grnd_level":1001.6,"humidity":72,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.2,"deg":312.007},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-09 18:00:00"},{"dt":1515531600,"main":{"temp":272.32,"temp_min":272.32,"temp_max":272.32,"pressure":1003.24,"sea_level":1038.66,"grnd_level":1003.24,"humidity":73,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.66,"deg":308.505},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-09 21:00:00"},{"dt":1515542400,"main":{"temp":267.535,"temp_min":267.535,"temp_max":267.535,"pressure":1005.5,"sea_level":1041.39,"grnd_level":1005.5,"humidity":80,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":2.31,"deg":321.5},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-10 00:00:00"},{"dt":1515553200,"main":{"temp":264.166,"temp_min":264.166,"temp_max":264.166,"pressure":1007.03,"sea_level":1043.15,"grnd_level":1007.03,"humidity":73,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.6,"deg":317.502},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-10 03:00:00"},{"dt":1515564000,"main":{"temp":261.111,"temp_min":261.111,"temp_max":261.111,"pressure":1007.92,"sea_level":1044.21,"grnd_level":1007.92,"humidity":66,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.06,"deg":301},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-10 06:00:00"},{"dt":1515574800,"main":{"temp":259.762,"temp_min":259.762,"temp_max":259.762,"pressure":1008.33,"sea_level":1044.85,"grnd_level":1008.33,"humidity":67,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.07,"deg":320},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-10 09:00:00"},{"dt":1515585600,"main":{"temp":259.368,"temp_min":259.368,"temp_max":259.368,"pressure":1009.21,"sea_level":1045.7,"grnd_level":1009.21,"humidity":61,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":1.01,"deg":336.5},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-10 12:00:00"},{"dt":1515596400,"main":{"temp":267.926,"temp_min":267.926,"temp_max":267.926,"pressure":1010.01,"sea_level":1046.18,"grnd_level":1010.01,"humidity":78,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":1.06,"deg":223.504},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-10 15:00:00"},{"dt":1515607200,"main":{"temp":272.98,"temp_min":272.98,"temp_max":272.98,"pressure":1009.01,"sea_level":1044.57,"grnd_level":1009.01,"humidity":78,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":1.51,"deg":202},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-10 18:00:00"},{"dt":1515618000,"main":{"temp":272.026,"temp_min":272.026,"temp_max":272.026,"pressure":1008.18,"sea_level":1043.62,"grnd_level":1008.18,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":1.16,"deg":181.502},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-10 21:00:00"},{"dt":1515628800,"main":{"temp":265.283,"temp_min":265.283,"temp_max":265.283,"pressure":1008.51,"sea_level":1044.35,"grnd_level":1008.51,"humidity":76,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":1.51,"deg":168.501},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-11 00:00:00"},{"dt":1515639600,"main":{"temp":266.532,"temp_min":266.532,"temp_max":266.532,"pressure":1008.12,"sea_level":1044.04,"grnd_level":1008.12,"humidity":78,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":1.23,"deg":171.001},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-11 03:00:00"},{"dt":1515650400,"main":{"temp":267.706,"temp_min":267.706,"temp_max":267.706,"pressure":1006.93,"sea_level":1042.78,"grnd_level":1006.93,"humidity":79,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":1.36,"deg":177},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-11 06:00:00"},{"dt":1515661200,"main":{"temp":268.86,"temp_min":268.86,"temp_max":268.86,"pressure":1006.58,"sea_level":1042.24,"grnd_level":1006.58,"humidity":83,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":1.81,"deg":187.503},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-11 09:00:00"},{"dt":1515672000,"main":{"temp":271.727,"temp_min":271.727,"temp_max":271.727,"pressure":1006.58,"sea_level":1041.98,"grnd_level":1006.58,"humidity":91,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":88},"wind":{"speed":1.96,"deg":199},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-11 12:00:00"},{"dt":1515682800,"main":{"temp":275.903,"temp_min":275.903,"temp_max":275.903,"pressure":1006.78,"sea_level":1041.87,"grnd_level":1006.78,"humidity":86,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":2.17,"deg":206.503},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-11 15:00:00"},{"dt":1515693600,"main":{"temp":280.187,"temp_min":280.187,"temp_max":280.187,"pressure":1005.06,"sea_level":1039.48,"grnd_level":1005.06,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.56,"deg":208.502},"rain":{"3h":0.03},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-11 18:00:00"},{"dt":1515704400,"main":{"temp":281.231,"temp_min":281.231,"temp_max":281.231,"pressure":1003.34,"sea_level":1037.54,"grnd_level":1003.34,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":48},"wind":{"speed":2.5,"deg":195.501},"rain":{"3h":0.03},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-11 21:00:00"},{"dt":1515715200,"main":{"temp":281.32,"temp_min":281.32,"temp_max":281.32,"pressure":1003.23,"sea_level":1037.42,"grnd_level":1003.23,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":56},"wind":{"speed":3.36,"deg":194.001},"rain":{"3h":0.0025},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-12 00:00:00"},{"dt":1515726000,"main":{"temp":282.08,"temp_min":282.08,"temp_max":282.08,"pressure":1002.39,"sea_level":1036.47,"grnd_level":1002.39,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.71,"deg":201.502},"rain":{"3h":1.75},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-12 03:00:00"},{"dt":1515736800,"main":{"temp":283.134,"temp_min":283.134,"temp_max":283.134,"pressure":999.89,"sea_level":1033.85,"grnd_level":999.89,"humidity":97,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.92,"deg":189.503},"rain":{"3h":4.0625},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-12 06:00:00"},{"dt":1515747600,"main":{"temp":282.922,"temp_min":282.922,"temp_max":282.922,"pressure":997.4,"sea_level":1031.24,"grnd_level":997.4,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.71,"deg":183},"rain":{"3h":5.65},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-12 09:00:00"},{"dt":1515758400,"main":{"temp":282.235,"temp_min":282.235,"temp_max":282.235,"pressure":995.66,"sea_level":1029.45,"grnd_level":995.66,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.95,"deg":180.501},"rain":{"3h":9},"snow":{},"sys":{"pod":"n"},"dt_txt":"2018-01-12 12:00:00"},{"dt":1515769200,"main":{"temp":281.382,"temp_min":281.382,"temp_max":281.382,"pressure":993.87,"sea_level":1027.57,"grnd_level":993.87,"humidity":96,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.5,"deg":160.502},"rain":{"3h":9.675},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-12 15:00:00"},{"dt":1515780000,"main":{"temp":284.878,"temp_min":284.878,"temp_max":284.878,"pressure":990.02,"sea_level":1023.38,"grnd_level":990.02,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.61,"deg":182.5},"rain":{"3h":6.6},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-12 18:00:00"},{"dt":1515790800,"main":{"temp":286.327,"temp_min":286.327,"temp_max":286.327,"pressure":986.59,"sea_level":1019.9,"grnd_level":986.59,"humidity":98,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.21,"deg":185.5},"rain":{"3h":6.25},"snow":{},"sys":{"pod":"d"},"dt_txt":"2018-01-12 21:00:00"}]
     * city : {"id":5180225,"name":"Bethlehem","coord":{"lat":40.6179,"lon":-75.3787},"country":"US","population":74982}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    @Override
    public String toString() {
        return "Weather{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", city=" + city +
                ", list=" + list +
                '}';
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        @Override
        public String toString() {
            return "CityBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", coord=" + coord +
                    ", country='" + country + '\'' +
                    ", population=" + population +
                    '}';
        }

        /**
         * id : 5180225
         * name : Bethlehem
         * coord : {"lat":40.6179,"lon":-75.3787}
         * country : US
         * population : 74982
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            @Override
            public String toString() {
                return "CoordBean{" +
                        "lat=" + lat +
                        ", lon=" + lon +
                        '}';
            }

            /**
             * lat : 40.6179
             * lon : -75.3787
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1515369600
         * main : {"temp":260.78,"temp_min":258.811,"temp_max":260.78,"pressure":1008.38,"sea_level":1045.71,"grnd_level":1008.38,"humidity":72,"temp_kf":1.96}
         * weather : [{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}]
         * clouds : {"all":32}
         * wind : {"speed":2.21,"deg":217.003}
         * sys : {"pod":"n"}
         * dt_txt : 2018-01-08 00:00:00
         * snow : {"3h":0.195}
         * rain : {"3h":0.03}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private SysBean sys;
        private String dt_txt;
        private SnowBean snow;
        private RainBean rain;
        private List<WeatherBean> weather;

        @Override
        public String toString() {
            return "ListBean{" +
                    "dt=" + dt +
                    ", main=" + main +
                    ", clouds=" + clouds +
                    ", wind=" + wind +
                    ", sys=" + sys +
                    ", dt_txt='" + dt_txt + '\'' +
                    ", snow=" + snow +
                    ", rain=" + rain +
                    ", weather=" + weather +
                    '}';
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public SnowBean getSnow() {
            return snow;
        }

        public void setSnow(SnowBean snow) {
            this.snow = snow;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 260.78
             * temp_min : 258.811
             * temp_max : 260.78
             * pressure : 1008.38
             * sea_level : 1045.71
             * grnd_level : 1008.38
             * humidity : 72
             * temp_kf : 1.96
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            @Override
            public String toString() {
                return "MainBean{" +
                        "temp=" + temp +
                        ", temp_min=" + temp_min +
                        ", temp_max=" + temp_max +
                        ", pressure=" + pressure +
                        ", sea_level=" + sea_level +
                        ", grnd_level=" + grnd_level +
                        ", humidity=" + humidity +
                        ", temp_kf=" + temp_kf +
                        '}';
            }

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 32
             */

            private int all;

            @Override
            public String toString() {
                return "CloudsBean{" +
                        "all=" + all +
                        '}';
            }

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 2.21
             * deg : 217.003
             */

            private double speed;
            private double deg;

            @Override
            public String toString() {
                return "WindBean{" +
                        "speed=" + speed +
                        ", deg=" + deg +
                        '}';
            }

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            @Override
            public String toString() {
                return "SysBean{" +
                        "pod='" + pod + '\'' +
                        '}';
            }

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class SnowBean {
            /**
             * 3h : 0.195
             */

            @SerializedName("3h")
            private double _$3h;

            @Override
            public String toString() {
                return "SnowBean{" +
                        "_$3h=" + _$3h +
                        '}';
            }

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.03
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 802
             * main : Clouds
             * description : scattered clouds
             * icon : 03n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            @Override
            public String toString() {
                return "WeatherBean{" +
                        "id=" + id +
                        ", main='" + main + '\'' +
                        ", description='" + description + '\'' +
                        ", icon='" + icon + '\'' +
                        '}';
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
