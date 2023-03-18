package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar alas){
        this.permukaan = alas;
    }

    public double hitungVolume(){
        return permukaan.getPanjangSisi() * permukaan.hitungLuas();
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}
