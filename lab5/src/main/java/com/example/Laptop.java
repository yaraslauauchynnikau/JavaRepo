package com.example;

class Laptop {
    String brand;
    int ram;
    int storage;
    double price;

    Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    void displayInfo() {
        System.out.printf("%s | RAM: %d ГБ | SSD: %d ГБ | Цена: %.2f%n",
                brand, ram, storage, price);
    }
}