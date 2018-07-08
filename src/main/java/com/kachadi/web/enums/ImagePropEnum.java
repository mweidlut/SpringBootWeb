package com.kachadi.web.enums;

/**
 * 图片属性
 * User: ROOT
 * Date: 2018/7/8 13:38
 */
public enum ImagePropEnum {

    Make("Make", "品牌"),
    Model("Model", "型号"),

    Date_Time("Date/Time", "日期时间"),

    Image_Height("Image Height", "高"),
    Image_Width("Image Width", "宽"),

    GPS_Longitude("GPS Longitude", "纬度"),
    GPS_Latitude("GPS Latitude", "精度"),
    ;

    public final String prop;
    private String desc;

    ImagePropEnum(String prop, String desc){
        this.prop = prop;
        this.desc = desc;
    }
}
