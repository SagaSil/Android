package com.example.administrator.myapplication;

public class DAO_Position {
    private double Lat;//위도
    private double Lng;//경도
    private int boardnumber;//글번호

    public double getLat(){
        return Lat;
    }

    public void setLat(){
        this.Lat = Lat;
    }

    public double getLng(){
        return Lng;
    }

    public void setLng(){
        this.Lng = Lng;
    }

    public int getboardnumber(){
        return boardnumber;
    }

    public void setBoardnumber(){
        this.boardnumber = boardnumber;
    }
}
