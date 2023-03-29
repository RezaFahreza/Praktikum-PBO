/*
* File : ExceptionOnArray.java 29/03/2023
* Deskripsi : Program penggunaan eksepsi menggunakan class library Java
* Dibuat oleh: Rizky Akhmad Fahreza
*/ 

package Eksepsi;

public class ExceptionOnArray {
    public static void main(String[] args) {
        // inisiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
    
}
