/*Nama: Tiara Zalfa Dzakiyah
NIM: D1041241042 
Tanggal: 20 Februari 2026*/


package Pertemuan9;
class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat() {
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }
}
public class ObjectdanClass {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Pajero Sport";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2022;
        mobil1.kecepatan = 120;
        
        mobil1.tampilkanInfo();
    }
}
