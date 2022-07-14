package com.company;

public class Car {

private int year;
private String model;
private Color color;

    public Car(int year, String model, Color color, Honda honda) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }


    public String getInfo(){
        return "Year: " + year +
        "\nModel: " + model +
        "\nColor: " + color ;

    }



}
