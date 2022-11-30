package com.bzl;

public class LineComparison {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double len;
    String g;

    public double LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.len = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return len;

    }
    public String compareTo(double a, double b){
        if (a < b){
            g =  "first is less";
        } if (a > b){
            g = "first is greater";
        } if (a == b){
            g = "equal";
        }
        return g;
    }

}