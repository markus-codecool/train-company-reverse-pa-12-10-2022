package com.codecool.data;

import java.time.LocalDate;

public abstract class Train {
    private final int id;
    private final LocalDate productionYear;
    private final double cost;

    protected Train(int id, LocalDate productionYear, double cost) {
        this.id = id;
        this.productionYear = productionYear;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public double getCost() {
        return cost;
    }
}
