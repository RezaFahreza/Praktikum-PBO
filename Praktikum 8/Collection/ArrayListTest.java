/*
* File : ArrayListTest.java 06/06/2023
* Deskripsi : Program implementasi objek array list sebagai koleksi
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Collection;

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        // inisialisasi Array list yang hanya berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // menambahkan elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s + " ");
        }
    }
}