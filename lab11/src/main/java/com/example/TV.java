package com.example;

class TV extends Device {
    private double screenSize;

    TV(String model, int year, double price, double screenSize) {
        super(model, year, price);
        this.screenSize = screenSize;
    }

    @Override
    public String getEnergyClass() {
        return "Высокий";
    }

    @Override
    public void turnOn() {
        System.out.printf("Телевизор %s: включаю, загрузка Smart TV%n", getModel());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: телевизор, диагональ: %.1f\"%n", screenSize);
    }

    public void changeChannel(int channel) {
        System.out.printf("Переключаю %s на канал %d%n", getModel(), channel);
    }
}
