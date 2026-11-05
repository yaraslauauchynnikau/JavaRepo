package com.example;

class Truck implements Transportable, Maintainable {
    private String brand;
    private int capacity;
    private String serviceDate;

    Truck(String brand, int capacity, String serviceDate) {
        this.brand = brand;
        this.capacity = capacity;
        this.serviceDate = serviceDate;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void transport(String cargo) {
        System.out.printf("Грузовик %s везёт \"%s\" по дороге%n", brand, cargo);
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void maintain() {
        System.out.printf("Грузовик %s проходит техобслуживание%n", brand);
    }

    @Override
    public String getServiceDate() {
        return serviceDate;
    }
}
