/*
* File : MapTest.java 06/06/2023
* Deskripsi : Program implementasi penggunaan generic untuk pasangan kunci-nilai
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
        // bagaiman iterasi untuk mengambil keseluruhan elemen
        // contoh:
        // 1 = satu
        for (int i : key){
            System.out.println(i + " = " + map.get(i));
        }
    }
}
