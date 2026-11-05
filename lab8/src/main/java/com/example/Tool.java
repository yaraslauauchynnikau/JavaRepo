package com.example;

class Tool {
    private String name;
    private int power;
    private double weight;

    Tool(String name, int power, double weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void use() {
        System.out.println("Инструмент используется");
    }

    public void displayInfo() {
        System.out.printf("%s | мощность: %d Вт | вес: %.2f кг%n",
                name, power, weight);
    }
}
