package com.company;

public class Car extends Transport {
    private String model;
    public Car(double volume, String model) {
        super(volume);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void print(){
        System.out.println(" " + getClass().getSimpleName()+
                "\n Обьем: " + super.getVolume()+
                "\n Модель: "+ getModel());
        super.print();
    }
}