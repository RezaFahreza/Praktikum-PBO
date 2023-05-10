/*
* File : Car.java 10/05/2023
* Deskripsi : implementasi subkelas dari vehicle
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_1;

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
