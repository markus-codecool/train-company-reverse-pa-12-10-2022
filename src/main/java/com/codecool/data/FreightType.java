package com.codecool.data;

public enum FreightType {
    NORMAL(0), NON_SOLID(150), DANGEROUS(300);

    private final double additionalRevenue;

    FreightType(double additionalRevenue) {
        this.additionalRevenue = additionalRevenue;
    }

    public double getAdditionalRevenue() {
        return additionalRevenue;
    }
}
