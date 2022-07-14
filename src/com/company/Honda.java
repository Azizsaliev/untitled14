package com.company;

public class Honda {

    private String model;
    private Color color;

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Honda(String model, Color color) {
        this.model = model;
        this.color = color;
    }
    public String getInfo(){
        return "Model: " + model +
                "\nColor: " + color ;
    }
}
