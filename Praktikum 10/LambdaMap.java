/*
* File : LambdaMap.java 06/06/2023
* Deskripsi : Program implementasi lambda pada Map
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<Integer,String> mahasiswa = new HashMap<Integer,String>();
        mahasiswa.put(30081, "Rizky Akhmad Fahreza");
        mahasiswa.put(40131, "Muhammad Raihan Ridho K");
        mahasiswa.put(40153, "Fikri Prasetya Nurhidayat");
        mahasiswa.put(40159, "Zaeri Haikal Rabani");
        mahasiswa.put(40149, "Derva Anargya Ghaly");

        mahasiswa.forEach((nim,nama) -> System.out.println("NIM: "+ nim +", Nama: "+ mahasiswa.get(nim)));
    }
}
