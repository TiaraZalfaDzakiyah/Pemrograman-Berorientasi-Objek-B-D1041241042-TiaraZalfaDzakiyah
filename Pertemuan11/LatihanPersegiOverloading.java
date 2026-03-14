//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan11;
class PersegiPanjang{
    int panjang;
    int lebar;
    int luas;
    int keliling;

    //constructor 1 dengan 1 param (panjang =  lebar)
    public PersegiPanjang(int sisi){
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang+lebar);
    }

    //constructor 2 dengan 2 param (panjang, lebar)
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang+lebar);
    }

    //method tampilkanInfo()
    public void tampilkanInfo(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Panjang : " + panjang + "cm");
        System.out.println("Lebar   : " + lebar + "cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        //object 1 dengan sisi 5 cm
        PersegiPanjang persegi1 = new PersegiPanjang(5);
        persegi1.tampilkanInfo();
        System.out.println();

        //object 2 dengan panjang 8 cm dan lebar 4 cm
        PersegiPanjang persegi2 = new PersegiPanjang(8, 4);
        persegi2.tampilkanInfo();
        System.out.println();
    }
}
