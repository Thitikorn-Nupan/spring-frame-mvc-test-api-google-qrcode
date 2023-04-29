package com.springframe.coding.entity;

public class Qrcode {
    private String length;
    private String color;
    private String info;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getColor() {
        /* delete # before sent */
        color = color.replaceAll("#","");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo() {
        /* delete spaces */
        int nSearch = info.indexOf(" ");

        if (nSearch >= 0) {
            info = info.replaceAll(" ","");
        }

        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Qrcode{" +
                "length='" + length + '\'' +
                ", color='" + color + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
