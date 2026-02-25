//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042


package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 1;
        int quantity = 2;
        int hargaSatuan; 
        int totalBayar;
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");

        switch(menuCode){
            case 1:
                System.out.println("Nama Menu: Nasi Goreng");
                hargaSatuan = 15000;
                totalBayar = hargaSatuan * quantity;
                break;
            case 2:
                System.out.println("Nama Menu: Mie Ayam");
                hargaSatuan = 12000;
                totalBayar = hargaSatuan * quantity;
                break;
            case 3:
                System.out.println("Nama Menu: Bakso");
                hargaSatuan = 10000;
                totalBayar = hargaSatuan * quantity;
                break;
            case 4:
                System.out.println("Nama Menu: Soto Ayam");
                hargaSatuan = 13000;
                totalBayar = hargaSatuan * quantity;
                break;
            case 5:
                System.out.println("Nama Menu: Es Teh");
                hargaSatuan = 3000;
                totalBayar = hargaSatuan * quantity;
                break;
            default:
                hargaSatuan = 0;
                totalBayar = 0;
                System.err.println("Kode menu tidak valid (1-5)");
                break;
        }
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + totalBayar);
    }    
}
