/*
* File : Programmer.java 10/05/2023
* Deskripsi : subkelas dari Pegawai
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Inclusion_2;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public void Programmer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("bonus : "+this.bonus);
    }
}
