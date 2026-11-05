package com.example;

interface Transportable {
    void transport(String cargo);
    int getCapacity();

    static void printTransportInfo() {
        System.out.println("=== Перевозка грузов ===");
    }
}
