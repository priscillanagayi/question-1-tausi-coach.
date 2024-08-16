/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainjourney;

/**
 *
 * @author hp
 */
public class SecondCoach {
    
    public static void main(String[] args) {
        int totalDistance = 10000;
        int offloadDistance = 150;
        int refuelDistance = 200;
        int speed = 250;
        int stopTime = 5;
        double speedMps = 225.5;
        double speedKmph = speedMps * 3.6;

        int offloadStops = totalDistance / offloadDistance;
        int refuelStops = totalDistance / refuelDistance;

        if (totalDistance % offloadDistance == 0) {
            offloadStops--;
        }
        if (totalDistance % refuelDistance == 0) {
            refuelStops--;
        }

        int totalStops = offloadStops + refuelStops;
        int travelTime = totalDistance / speed;
        double totalStopTime = totalStops * (stopTime / 60.0);
        double totalTime = travelTime + totalStopTime;
        System.out.println("Total time taken: " + totalTime + " hours");

        int refuelOnlyStops = totalDistance / refuelDistance;
        if (totalDistance % refuelDistance == 0) {
            refuelOnlyStops--;
        }
        double refuelTotalTime = (totalDistance / speed) + (refuelOnlyStops * (stopTime / 60.0));
        System.out.println("Total time taken for return journey: " + refuelTotalTime + " hours");

        double travelTimeSecondCoach = totalDistance / speedKmph;
        int startHour = 9;
        int startMinute = 0;
        int totalMinutes = (int) (travelTimeSecondCoach * 60);
        int endHour = startHour + totalMinutes / 60;
        int endMinute = startMinute + totalMinutes % 60;
        if (endMinute >= 60) {
            endMinute -= 60;
            endHour++;
        }
        System.out.println("Approximate arrival time: " + endHour + ":" + (endMinute < 10 ? "0" : "") + endMinute);
    }
}
