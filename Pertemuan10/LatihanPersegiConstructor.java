//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan10;
class PersegiConstructor{
    int sisi;
    int luas;
    int keliling;

    //contructor 1 parameter
    public PersegiConstructor(int sisi){
        if(sisi <= 0){
            System.err.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else{
            this.sisi = sisi;
        }
        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    //method
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        //object dengan sisi 5 cm
        PersegiConstructor persegi1 = new PersegiConstructor(5);
        persegi1.tampilkanHasil();

        //object dengan sisi 1 cm
        PersegiConstructor persegi2 = new PersegiConstructor(1);
        persegi2.tampilkanHasil();
    }
}
