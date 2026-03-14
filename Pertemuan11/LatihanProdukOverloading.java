//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan11;
class Produk{
    String namaProduk;
    int harga;
    int stok;

    //constructor 1 menggunakan 2 param (nama dan harga)
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = 0;
    }

    //constructor 2 dengan 3 param (nama, harga, dan stok)
    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    //method tampilkanInfo()
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga      : Rp " + harga);
        System.out.println("Stok       : " + stok);
    }
}
public class LatihanProdukOverloading {
    public static void main(String[] args) {
        //object pertama menggunakan constructor 1
        Produk produk1 = new Produk("Laptop Asus", 8500000);
        produk1.tampilkanInfo();
        System.out.println();

        //object kedua menggunakan constructor 2
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);
        produk2.tampilkanInfo();
        System.out.println();
    }
}
