//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan14;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}};//inisialisasi jagged array
        System.out.println("=== JAGGED ARRAY ===");

        //menampilkan semua elemen jagged array
        for(int i = 0; i < jaggedArray.length; i++){
            System.out.print("Baris " + i + " (" + jaggedArray[i].length + " elemen): ");
            for(int j = 0; j < jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
