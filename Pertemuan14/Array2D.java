//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan14;

public class Array2D {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //inisialisasi array data
        System.out.println("=== TABEL 3X3 ===");

        //menampilkan semua elemen array
        for(int i = 0; i < data.length; i++){ //BARIS
            for(int j = 0; j < data.length; j++){ //KOLOM
                System.out.print(data[i][j] + "    ");
            }
            System.out.println();
        }

    }
}
