// MKubus.java 22/03/22
// Penulis : Rizky Akhmad Fahreza
// Deskripsi : Program utama dari kelas Kubus

package org.main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Alas Kubus: "+ kubus.hitungLuasAlas());
        System.out.println("Volume Kubus: "+ kubus.hitungVolume());
    }
    
}

