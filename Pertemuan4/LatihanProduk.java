/*Nama: Tiara Zalfa Dzakiyah
NIM: D1041241042 */


package Pertemuan4;

public class LatihanProduk {
    public static void main(String[] args) {
        System.out.println("=== INFORMASI PRODUK ===");
        String namaProduk = "Laptop Asus";
        int harga = 7000000; 
        int jumlahStok = 15; 
        boolean isState = true; 
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Satuan : Rp " + harga);
        System.out.println("Jumlah Stok : " + jumlahStok);
        System.out.println("Status Tersedia : " + isState);
        System.out.println("---");
        long totalNilai = (long)harga*jumlahStok;
        double PAJAK = 0.11;
        System.out.println("Total Nilai Stok : Rp " + totalNilai);
        System.out.println("Pajak (11%) : Rp " + ((long)(totalNilai*PAJAK)));
    }
}
