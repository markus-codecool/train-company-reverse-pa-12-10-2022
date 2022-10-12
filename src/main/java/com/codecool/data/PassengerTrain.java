package com.codecool.data;

import java.time.LocalDate;

public class PassengerTrain extends Train {
    private final static double PASSENGER_TRAIN_COST = 1000;

    private int numberOfCoaches = 0;

    public PassengerTrain(int id, LocalDate productionYear) {
        super(id, productionYear, PASSENGER_TRAIN_COST);
    }

    protected PassengerTrain(int id, LocalDate productionYear, double cost) {
        super(id, productionYear, cost);
    }

    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }
}
