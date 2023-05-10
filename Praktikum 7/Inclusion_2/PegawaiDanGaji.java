/*
* File : PegawaiDanGaji.java 10/05/2023
* Deskripsi : implementasi kelas main
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 


package Inclusion_2;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
