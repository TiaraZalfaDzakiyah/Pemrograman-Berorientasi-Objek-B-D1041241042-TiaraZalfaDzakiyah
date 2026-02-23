package Pertemuan7;

import java.util.Scanner; //menggunakan objek dari scanner untuk input nilai
public class LatihanValidasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== VALIDASI NILAI UJIAN === ");
        int nilai;
        do{
            System.out.print("Percobaan Input: ");
            nilai = input.nextInt(); //input nilai
            if (nilai >= 0 && nilai <= 100){
                System.out.println("[OK] Nilai valid: " + nilai);
            } else {
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            }
        } while (nilai < 0  || nilai > 100);
    }
}
//REFERENSI SINTAKS INPUT NILAI
//https://www.programiz.com/java-programming/basic-input-output