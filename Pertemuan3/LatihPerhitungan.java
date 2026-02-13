package Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal            : " + saldo);
        int setoran = 500000;
        saldo += setoran;
        System.out.println("Setoran               : " + setoran);
        System.out.println("Saldo Setelah Setor   : " + saldo);
        int penarikan = 250000;
        saldo -= 250000;
        System.out.println("Penarikan             : " + penarikan);
        System.out.println("Saldo Akhir           : " + saldo);
    }
}
