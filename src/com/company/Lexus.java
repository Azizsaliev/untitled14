package com.company;

public final class Lexus extends Tayota {


    public Lexus(int year, String model, Color color, Honda honda, double volume, String machineBox) {
        super(year, model, color, honda, volume, machineBox);
    }

    public Lexus(int year, String model, double volume) {
        super(year, model, volume);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
