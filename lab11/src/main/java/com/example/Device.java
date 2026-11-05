package com.example;

class Device {
    private String model;
    private int year;
    private double price;

    Device(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void turnOn() {
        System.out.printf("%s: включаю%n", model);
    }

    public void turnOn(int power) {
        System.out.printf("%s: включаю на мощность %d Вт%n", model, power);
    }

    public void turnOn(String mode) {
        System.out.printf("%s: включаю в режиме \"%s\"%n", model, mode);
    }

    public String getEnergyClass() {
        return "Средний";
    }

    public void displayInfo() {
        System.out.printf("%s (%d) | цена: %.2f | класс энергии: %s%n",
                model, year, price, getEnergyClass());
    }
}
