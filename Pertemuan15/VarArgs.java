//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan15;

public class VarArgs {
    //method hitung rata rata
    static double hitungRataRata(int... nilai){
        if(nilai.length == 0){
            return 0;
        }
        int total = 0;
        for(int n : nilai){
            total+=n;
        }
        return (double) total/nilai.length;
    }
    public static void main(String[] args) {
        double rata1 = hitungRataRata(70, 80, 90); //menghitung rata1
        System.out.println("Rata-rata (3 nilai): " + rata1);

        double rata2 = hitungRataRata(85, 90, 78, 92, 88); //menghitung rata2
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}
