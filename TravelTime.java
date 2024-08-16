/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainjourney;

/**
 *
 * @author hp
 */
public class TravelTime {
    
    public static void main(String[] args) {
        int totalDistance = 10000; 
        int speed = 250; 
        int stopTime = 5; 

        int offloadDistance = 150; 
        int refuelDistance = 200; 

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
    }
}

    

