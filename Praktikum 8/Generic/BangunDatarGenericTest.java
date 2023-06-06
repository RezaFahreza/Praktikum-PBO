/*
* File : BangunDatarGenericTest.java 06/06/2023
* Deskripsi : Program main untuk generic bangun datar
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Generic;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }   
}
