/*
* File : PolimorfismeCoercion.java 10/05/2023
* Deskripsi : Program implementasi polimorfisme coercion
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Coercion;

public class PolimorfismeCoercion{
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args) {
        // deklarasi objek integer
        Integer bilangan = 10;

        // objek integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}