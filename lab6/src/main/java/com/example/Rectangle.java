package com.example;

class Rectangle {
    private double width;
    private double height;

    private double amount;

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, double amount) {
        this(width, height);
        this.amount = amount;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void displayInfo() {
        System.out.printf("Прямоугольник %.2f x %.2f | Площадь: %.2f | Периметр: %.2f%n",
                width, height, area(), perimeter());
    }
}