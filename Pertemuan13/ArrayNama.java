//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan13;

public class ArrayNama {
   public static void main(String[] args) {
    String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
    System.out.println("=== DAFTAR NAMA ===");

    for(int i = 0; i < nama.length; i++){//menampilkan elemen array nama
        System.out.println((i+1) + ". " + nama[i]);
    }
   }
}

