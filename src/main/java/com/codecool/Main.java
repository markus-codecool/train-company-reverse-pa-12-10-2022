package com.codecool;

import com.codecool.data.*;
import com.codecool.service.RevenueService;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RevenueService revenueService = new RevenueService();

        FreightTrain freightTrain = new FreightTrain(0, LocalDate.of(1997, Month.FEBRUARY, 8));
        PassengerTrain passengerTrain = new PassengerTrain(1, LocalDate.of(2004, Month.JUNE, 4));
        ICTrain icTrain = new ICTrain(4, LocalDate.of(2000, Month.JULY, 4));

        freightTrain.setFreightType(FreightType.DANGEROUS);

        icTrain.setNumberOfCoaches(10);
        passengerTrain.setNumberOfCoaches(8);
        List<Train> trains = List.of(freightTrain, passengerTrain, icTrain);
        System.out.println(revenueService.calculateMonthlyProfit(trains));
    }
}