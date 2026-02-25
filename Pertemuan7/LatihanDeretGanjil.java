//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042


package Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        int angka = 1;
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        while (angka <= 15){ //iterasi sampai 15
            if (angka % 2 != 0){ //mengecek angka ganjil
                System.out.print(angka + " "); //tampilkan angka ganjil
            }
            angka++; //update
        }
    }
}
