package com.allstate.models;

import java.lang.*;
import java.lang.Math;

/**
 * Created by localadmin on 11/01/17.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public static double distance(Point p1, Point p2){
        double y = p2.getY() - p1.getY();
        double x = p2.getX() - p1.getX();
        y = Math.pow(y, 2);
        x = Math.pow(x, 2);
        return Math.sqrt(x+y);
    }

    public static double slope(Point p1, Point p2){
        double y = p2.getY() - p1.getY();
        double x = p2.getX() - p1.getX();
        return y/x;
    }

    public static double yintercept(Point p1, Point p2){
        double slp = Point.slope(p1, p2);
        return p1.getY() - slp * p1.getX();
    }
}
