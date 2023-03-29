// BangunDatar.java 28/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : Kelas abstrak, berisi abstraksi bangun datar

package KelasAbstrak;

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double luas){
        this.luas = luas;
    }

    public double getLuas(){
        return luas;
    }
}