package com.example;

class Saw extends Tool {
    private int teeth;

    Saw(String name, int power, double weight, int teeth) {
        super(name, power, weight);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    @Override
    public void use() {
        System.out.println("Пилит материалы");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: пила, зубьев: %d%n", teeth);
    }

    public void sharpen() {
        System.out.println("Точим пилу " + getName());
    }
}
