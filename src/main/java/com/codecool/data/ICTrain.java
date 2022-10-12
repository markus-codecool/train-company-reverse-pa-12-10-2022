package com.codecool.data;

import java.time.LocalDate;

public class ICTrain extends PassengerTrain {
    private final static double IC_TRAIN_COST = 1200;

    public ICTrain(int id, LocalDate productionYear) {
        super(id, productionYear, IC_TRAIN_COST);
    }

    @Override
    public void setNumberOfCoaches(int numberOfCoaches) {
        if (numberOfCoaches > 10) {
            throw new IllegalArgumentException("IC trains cannot have more than 10 coaches. Given value was: " + numberOfCoaches);
        }
        super.setNumberOfCoaches(numberOfCoaches);
    }
}
