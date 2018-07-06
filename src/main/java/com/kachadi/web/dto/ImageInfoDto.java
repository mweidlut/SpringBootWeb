package com.kachadi.web.dto;


public class ImageInfoDto {

    private String make;  //品牌 - Make
    private String model; //型号 - Model

    private String time;  //日期时间 - Date/Time

    private String heightPix; //高 - Image Height
    private String widthPix;  //宽 - Image Width

    private String gpsLatitude; //纬度 - GPS Longitude
    private String gpsLongitude; //精度 - GPS Latitude

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHeightPix() {
        return heightPix;
    }

    public void setHeightPix(String heightPix) {
        this.heightPix = heightPix;
    }

    public String getWidthPix() {
        return widthPix;
    }

    public void setWidthPix(String widthPix) {
        this.widthPix = widthPix;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }
}
