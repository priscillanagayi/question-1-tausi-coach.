/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trainjourney;

/**
 *
 * @author hp
 */
public class TrainJourney {
    public static void main(String[] args) {
        int totalDistance = 10000; 
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

        System.out.println("Number of stops for offloading/loading: " + offloadStops);
        System.out.println("Number of stops for refueling: " + refuelStops);
    }
}

