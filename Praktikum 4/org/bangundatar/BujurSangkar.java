// BujurSangkar.java 01/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : Kelas Bujur Sangkar dengan Konstruktor dan Methodnya

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }
    
    public double hitungLuas(){
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
