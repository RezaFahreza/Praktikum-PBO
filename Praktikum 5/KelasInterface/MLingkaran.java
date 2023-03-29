// MLingkaran.java 28/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : implementasi cara menghitung luas lingkaran

package KelasInterface;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran :");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan jejari "+ r + "satuan adalah "+ l.hitungLuas());
    }
}
