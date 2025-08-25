package com.atria.day5;

public class City extends State {
    private String cityname;
    private String area;

    public String getCityname() {
        return cityname;
    }
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City [cityname=" + cityname + ", area=" + area +
               ", statename=" + getStatename() +
               ", lang=" + getLang() +
               ", countryName=" + getName() +
               ", capital=" + getCaptital() + "]";
    }
}





