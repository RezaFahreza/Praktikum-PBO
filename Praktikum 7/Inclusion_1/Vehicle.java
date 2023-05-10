/*
* File : Vehicle.java 10/05/2023
* Deskripsi : implementasi superclass Vehicle
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_1;

public class Vehicle {
    void calRent (int distance, float price){
        float fare = distance*price;
        System.out.println("Vehicle price = "+ fare);
    }
}
