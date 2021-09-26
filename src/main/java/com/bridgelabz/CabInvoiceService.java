package com.bridgelabz;

public class CabInvoiceService {
    private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = distance* MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare< MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }

    public double calculateTotalAggregate(MultipleRide[] rides) {
        double totalAggeregate = 0;
        for (MultipleRide ride : rides){
            totalAggeregate += this.calculateFare(ride.distance,ride.time);
        }
        return totalAggeregate/rides.length;
    }
}
