package com.company;

public class Bicycle extends Transport{
    private int size;

    public int getSize() {
        return size;
    }

    public Bicycle(double volume, int size) {
        super(volume);
        this.size=size;
    }

    public void print(){
        System.out.println(" " + getClass().getSimpleName()+
                "\n Обьем: " + super.getVolume()+
                "\n Размер: " + getSize());
        super.print();

    }

}
