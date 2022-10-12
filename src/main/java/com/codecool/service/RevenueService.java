package com.codecool.service;

import com.codecool.data.*;

import java.util.List;

public class RevenueService {
    private static final double BASE_FREIGHT_TRAIN_REVENUE = 550;
    private static final double ADDITIONAL_TICKET_REVENUE = 2;
    private static final int AVERAGE_DAILY_PASSENGERS = 50;

    public double calculateMonthlyProfit(List<Train> trains) {
        double result = 0;
        for (Train train : trains) {
            if (train instanceof PassengerTrain passengerTrain) {
                result += calculateMonthlyPassengerTrainProfit(passengerTrain);
            } else if (train instanceof FreightTrain freightTrain) {
                result += calculateMonthlyFreightTrainProfit(freightTrain);
            } else {
                throw new IllegalStateException("Unexpected value: " + train);
            }

            result -= train.getCost();
        }
        return result;
    }

    private double calculateMonthlyFreightTrainProfit(FreightTrain train) {
        return BASE_FREIGHT_TRAIN_REVENUE + train.getFreightType().getAdditionalRevenue();
    }

    private double calculateMonthlyPassengerTrainProfit(PassengerTrain train) {
        TicketType ticketType = TicketType.PASSENGER;
        if (train instanceof ICTrain) {
            ticketType = TicketType.IC;
        }
        int coaches = train.getNumberOfCoaches();
        int numberOfMonthlyPassengers = AVERAGE_DAILY_PASSENGERS * coaches * 30;
        int numberOfAdditionalCostPassengers = (int) (numberOfMonthlyPassengers * .25);

        double baseTicketRevenue = numberOfMonthlyPassengers * ticketType.getTicketPrice();
        double additionalTicketRevenue = numberOfAdditionalCostPassengers * ADDITIONAL_TICKET_REVENUE;
        return baseTicketRevenue + additionalTicketRevenue;
    }
}
