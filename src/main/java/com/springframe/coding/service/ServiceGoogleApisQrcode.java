package com.springframe.coding.service;

public class ServiceGoogleApisQrcode {
    private String apis;

    public ServiceGoogleApisQrcode(String length,String info , String color) {
        setApis(length,info,color);
    }

    private void setApis(String length,String info , String color) {
        apis =  "https://chart.googleapis.com/chart?&cht=qr&chs="+length+"&chl="+info+"&chco="+color;
    }
    public String getApis() {
        return apis;
    }
}
