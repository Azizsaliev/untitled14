package com.company;

public class Tayota extends Car {
    private double volume;
    private String machineBox;


    public Tayota(int year, String model, Color color, Honda honda) {
        super(year, model, color, honda);
    }


    public Tayota(int year, String model, Color color, Honda honda, double volume, String machineBox) {
        super(year, model, color, honda);
        this.volume = volume;
        this.machineBox = machineBox;
    }

    public Tayota(int year, String model, double volume) {
        super(year, model);
        this.volume = volume;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\nVolume: " +  volume +
                "\nMachineBox: " + machineBox ;
    }
}
