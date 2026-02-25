//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042


package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
        //menggunakan while untuk menampilkan angka 1 sampai 5
        int angka = 1;
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while (angka <= 5){
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println();
        System.out.println();

        //menggunakan do-while
        int angka2 = 1;
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        do{
            System.out.print(angka2 + " ");
            angka2++;
        } while(angka2 <= 5);
        System.out.println();
        System.out.println();

        //menggunakan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        for(int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
}
