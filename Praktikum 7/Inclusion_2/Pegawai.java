/*
* File : Pegawai.java 10/05/2023
* Deskripsi : Kelas super Pegawai
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_2;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+this.nama +", Gaji pokok : "+this.gajiPokok);
    }
}
