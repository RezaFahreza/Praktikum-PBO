// Poligon.java 22/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : Kelas Poligon dengan Konstruktor dan Methodnya

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public void poligon(){
        jumlahSisi = 0;
    }

    public void setJumlahSisi(int n){
        jumlahSisi = n;
    }
    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
