//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan13;

public class ArrayNilai {
    public static void main(String[] args) {
     //inisialisasi array
    int[] nilai = {85, 90, 78, 92, 88};
    System.out.println("=== DAFTAR NILAI ===");
    for(int i = 0; i < nilai.length; i++){ //menampilkan elemen array
        System.out.println("Nilai " + (i+1) + ": " + nilai[i]);
    }
    System.out.println();
    System.out.println("Total Nilai: " + nilai.length);
    }
}