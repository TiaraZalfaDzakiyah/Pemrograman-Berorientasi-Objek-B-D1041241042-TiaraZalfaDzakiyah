//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan9;
class Mobil{ //class mobil
    //atribut
    String merk;
    String warna;
    String tahun;
    int kecepatan;
    
    //method
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
    public void percepat(){
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
    }
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}
public class ClassMobil {
    public static void main(String[] args){
        //membuat objek mobil
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota Avanza";
        mobil.warna = "Silver";
        mobil.tahun = "2020";
        mobil.kecepatan = 0;

        //menampilkan method tampilkanSpesifikasi()
        mobil.tampilkanSpesifikasi();
        System.out.println();

        //menampilkan method percepat()
        mobil.percepat();
        mobil.percepat();

        //menampilkan method tampilkanKecepatan()
        mobil.tampilkanKecepatan();
    } 
}
