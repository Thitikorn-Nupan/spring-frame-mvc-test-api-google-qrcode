package com.springframe.coding.service;

public class ServiceGoogleApisQrcode {
    private String apis;

    public ServiceGoogleApisQrcode(String length,String info ) {
        setApis(length,info);
    }

    private void setApis(String length,String info ) {
        apis =  "https://quickchart.io/chart?cht=qr&chs="+length+"&chl="+info;
    }
    public String getApis() {
        return apis;
    }
}
