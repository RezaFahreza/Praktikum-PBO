/*
* File : AngkaSialException.java 29/03/2023
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Eksepsi;

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
