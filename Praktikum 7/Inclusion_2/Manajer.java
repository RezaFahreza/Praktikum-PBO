/*
* File : Manajer.java 10/05/2023
* Deskripsi : subkelas dari Pegawai
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_2;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public void Manajer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+this.tunjangan);
    }
}
