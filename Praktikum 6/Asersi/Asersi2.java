/*
* File : Asersi2.java 29/03/2023
* Deskripsi : Program untuk demo asersi, yang akan menolak input
* jari-jari lingkaran yang bernilai nol
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Asersi;

// 
class Lingkaran {
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = "+ kelilingLingkaran);
    }
}

/* 
 * Jawaban: 
 * Berdasarkan pemahaman saya yang didapat dari penjelasan
 * asprak dan modul, tidak ada kesalahan yang terdapat pada program. 
 */
