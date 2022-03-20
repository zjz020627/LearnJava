package com.study.exer3;

public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        this.color = "white";
        this.weight = 1.0;
    }

    protected GeometricObject(String color,double weight){
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}