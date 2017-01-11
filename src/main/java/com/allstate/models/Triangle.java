package com.allstate.models;

import java.util.List;

/**
 * Created by localadmin on 11/01/17.
 */
public class Triangle {
    private int height;
    private int weight;

    public static int area (List<Triangle> triangles){
        return triangles.stream().map((item) ->item.getArea()).reduce((acc, item) -> acc +item).get();

    }

    public Triangle() {
    }

    public Triangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getArea(){
        return (this.height * this.weight)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
