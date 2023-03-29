// Lingkaran.java 28/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran

package KelasInterface;

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
