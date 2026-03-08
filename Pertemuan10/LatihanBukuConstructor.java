//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan10;
class BukuConstructor{
    String judul;
    String pengarang;
    int harga;

    public BukuConstructor(){ //constructor tanpa parameter
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    //constructor dengan parameter
    public BukuConstructor(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println();
    }
}
public class LatihanBukuConstructor {
    public static void main(String[] args) {
        //Object 1 menggunakan constructor tanpa parameter
        BukuConstructor buku1 = new BukuConstructor();
        buku1.tampilkanInfo();

        //Object 2 dan 3 menggunakan constructor dengan parameter
        BukuConstructor buku2 = new BukuConstructor("Pemrograman Java", "Budi Raharjo", 125000);
        buku2.tampilkanInfo();
        BukuConstructor buku3 = new BukuConstructor("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        buku3.tampilkanInfo();
    }
}
