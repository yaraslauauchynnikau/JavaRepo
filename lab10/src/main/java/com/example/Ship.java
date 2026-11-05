package com.example;

class Ship implements Transportable, Maintainable {
    private String brand;
    private int capacity;
    private double tonnage;

    Ship(String brand, int capacity, double tonnage) {
        this.brand = brand;
        this.capacity = capacity;
        this.tonnage = tonnage;
    }

    public String getBrand() {
        return brand;
    }

    public double getTonnage() {
        return tonnage;
    }

    @Override
    public void transport(String cargo) {
        System.out.printf("Корабль %s везёт \"%s\" по воде%n", brand, cargo);
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void maintain() {
        System.out.printf("Корабль %s встаёт в док на обслуживание%n", brand);
    }

    @Override
    public String getServiceDate() {
        return "водоизмещение " + tonnage + " т";
    }
}
