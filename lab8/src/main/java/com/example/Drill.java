package com.example;

class Drill extends Tool {
    private int speed;

    Drill(String name, int power, double weight, int speed) {
        super(name, power, weight);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void use() {
        System.out.println("Сверлит отверстия");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: дрель, скорость: %d об/мин%n", speed);
    }

    public void changeBit() {
        System.out.println("Меняем сверло на " + getName());
    }
}
