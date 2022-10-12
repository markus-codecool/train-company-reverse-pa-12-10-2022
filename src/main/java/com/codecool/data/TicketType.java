package com.codecool.data;

public enum TicketType {
    PASSENGER(1.5), IC(2);

    private final double ticketPrice;
    TicketType(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
