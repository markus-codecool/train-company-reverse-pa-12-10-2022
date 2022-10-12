package com.codecool.data;

import java.time.LocalDate;

public class FreightTrain extends Train {
    private final static double FREIGHT_TRAIN_COST = 300;
    private FreightType freightType;

    public FreightTrain(int id, LocalDate productionYear) {
        super(id, productionYear, FREIGHT_TRAIN_COST);
    }

    public FreightType getFreightType() {
        return freightType;
    }

    public void setFreightType(FreightType freightType) {
        this.freightType = freightType;
    }
}
