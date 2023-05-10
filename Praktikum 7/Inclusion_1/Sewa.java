/*
* File : Sewa.java 10/05/2023
* Deskripsi : implementasi kelas main
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_1;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 10000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
