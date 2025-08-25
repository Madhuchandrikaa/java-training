package com.atria.day5;

public class State extends Country {
    private String statename;
    private String lang;

    public String getStatename() {
        return statename;
    }
    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "State [statename=" + statename + ", lang=" + lang + "]";
    }
}
