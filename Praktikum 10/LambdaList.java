/*
* File : LambdaList.java 06/06/2023
* Deskripsi : Program implementasi lambda pada list, digunakan sebagai parameter pada method
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}
