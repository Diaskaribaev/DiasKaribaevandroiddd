package com.example.earthquakeapp;

public class Information {

    private String number;
    private String km;
    private String place;
    private String date;
    private String time;
    private int imageid;

    public Information(String number1,String km1,String place1,String date1,String time1,int imageid1) {
        number = number1;
        km = km1;
        place = place1;
        date = date1;
        time = time1;
        imageid = imageid1;

    }

    public String getNumber() {
        return number;
    }

    public String getKm() {
        return km;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getImageid() {
        return imageid;
    }
}
