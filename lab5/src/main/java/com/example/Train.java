package com.example;

class Train {
    String destination;
    int trainNumber;
    int travelTime;

    Train(String destination, int trainNumber, int travelTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.travelTime = travelTime;
    }

    public String toString() {
        return "Destination: " + this.destination + "\n"
        + "TrainNumber: " + this.trainNumber + "\n"
        + "TravelTime: " + this.travelTime;
    }
}