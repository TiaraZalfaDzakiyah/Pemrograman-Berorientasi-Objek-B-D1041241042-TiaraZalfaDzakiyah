//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan9;
class Buku{ //class buku
    //atribut
    String judul;
    String namaPengarang;
    int hargaBuku;

    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + namaPengarang);
        System.out.println("Harga: Rp " + hargaBuku);
    }
}

public class ClassBuku{
    public static void main(String[] args){
        //membuat objek buku pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.namaPengarang = "Budi Raharjo";
        buku1.hargaBuku = 125000;

        //membuat objek buku kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.namaPengarang = "Rinaldi Munir";
        buku2.hargaBuku = 150000;

        //menampilkan data buku1
        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo(); //menampilkan data buku2
    }
}