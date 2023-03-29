/*
* File : AngkaSial.java 29/03/2023
* Deskripsi : Program penggunaan exception buatan sendiri
* Pengenalan klausa 'throw' dan 'throws'
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Eksepsi;

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.print("hati-hati memasukkan angka!!!");
        }
    }
}

/* 
 * Jawaban: 
 * 1. baris 12 tidak dijalankan karena baris 12 dapat berjalan apabila angka
 * yang dimasukkan tidak memenuhi syarat eksepsi
 * 
 * 2. bari 21 dieksekusi untuk mengeluarkan output berupa string
 * yang menandakan bahwa angka yang dimasukkan merupakan angka sial.
 */
 

