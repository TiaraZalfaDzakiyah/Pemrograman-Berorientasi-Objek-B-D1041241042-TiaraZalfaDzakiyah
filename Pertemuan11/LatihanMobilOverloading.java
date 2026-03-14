//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan11;
class MobilOverloading{
    String merk;
    String warna;
    int tahun;

    //Constructor 1 tanpa param
    public MobilOverloading(){
        this.merk = "Unknown";
        this.warna = "Unknown";
        this.tahun = 0;
    }

    //Constructor 2 dengan 1 param (merk)
    public MobilOverloading(String merk){
        this.merk = merk;
        this.warna = "Unknown";
        this.tahun = 0;
    }

    //Constructor 3 dengan 3 param (merk, warna, tahun)
    public MobilOverloading(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    //method tampilkanSpesifikasi()
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}

public class LatihanMobilOverloading{
    public static void main(String[] args){
        //object pertama menggunakan constructor 1
        MobilOverloading mobil1 = new MobilOverloading();
        mobil1.tampilkanSpesifikasi();
        System.out.println();

        //object kedua menggunakan constructor 2
        MobilOverloading mobil2 = new MobilOverloading("Toyota");
        mobil2.tampilkanSpesifikasi();
        System.out.println();

        //object ketiga menggunakan consttructor 3
        MobilOverloading mobil3 = new MobilOverloading("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
        System.out.println();
    }
}