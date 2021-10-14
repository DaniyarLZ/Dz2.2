package com.company;

public class Transport implements Printable{
    private double volume;

    public Transport(double volume) {

        this.volume = volume;
    }

    public double getVolume() {

        return volume;
    }


    @Override
    public void print() {
        System.out.println(" " + getClass().getSimpleName()+
                "\n Обьем: " + getVolume());
    }
}
