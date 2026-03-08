//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan10;
class MobilConstructor{
    String merk;
    String warna;
    int tahun;

    //constructor default
    public MobilConstructor(){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    //constructor dengan 1 parameter
    public MobilConstructor(String merk){
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }

    //constructor dengan 3 parameter
    public MobilConstructor(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    //method
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}
public class LatihanMobilConstructor {
    public static void main(String[] args) {
        //object dengan constructor default
        MobilConstructor mobil1 = new MobilConstructor();
        mobil1.tampilkanSpesifikasi();

        //object dengan constructor 1 parameter
        MobilConstructor mobil2 = new MobilConstructor("Toyota");
        mobil2.tampilkanSpesifikasi();

        //object dengan constructor 3 parameter
        MobilConstructor mobil3 = new MobilConstructor("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
}
