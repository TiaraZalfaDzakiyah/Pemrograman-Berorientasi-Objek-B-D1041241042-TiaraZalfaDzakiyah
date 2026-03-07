//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan9;
class Persegi{
    int sisi;
    int luas;
    int keliling;

    public void hitungLuas(){
        luas = sisi*sisi;
    }
    public void hitungKeliling(){
        keliling = 4*sisi;
    }
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.err.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class ClassPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilkanHasil();
    }
}
