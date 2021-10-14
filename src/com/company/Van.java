package com.company;

public class Van extends Transport{
    private int year;

    public Van(double volume, int year) {
        super(volume);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void print() {
        System.out.println(" " + getClass().getSimpleName() +
                "\n Обьем: " + super.getVolume() +
                "\n Год изг.: " + getYear());
        super.print();
    }
}
