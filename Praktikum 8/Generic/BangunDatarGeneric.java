/*
* File : BangunDataGeneric.java 06/06/2023
* Deskripsi : Program implementasi kelas konstruksi generic untuk BangunDatar
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Generic;

public class BangunDatarGeneric <Type extends BangunDatar> {
    private Type bangunDatar;

    public void set(Type tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public Type get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
