package com.example;

class Fridge extends Device {
    private int volume;

    Fridge(String model, int year, double price, int volume) {
        super(model, year, price);
        this.volume = volume;
    }

    @Override
    public String getEnergyClass() {
        return "Низкий";
    }

    @Override
    public void turnOn() {
        System.out.printf("Холодильник %s: запуск компрессора%n", getModel());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: холодильник, объём: %d л%n", volume);
    }

    public void defrost() {
        System.out.printf("Разморозка %s запущена%n", getModel());
    }
}
