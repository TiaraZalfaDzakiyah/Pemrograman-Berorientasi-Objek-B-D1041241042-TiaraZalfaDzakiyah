//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042


package Pertemuan6;

public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 4;
        int jumlahHari;
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        //menentukan nama bulan
        switch (month){
            case 1:
                System.out.println("Bulan: Januari (bulan ke-1)");
                break;
            case 2:
                System.out.println("Bulan: Februari (bulan ke-2)");
                break;
            case 3:
                 System.out.println("Bulan: Maret (bulan ke-3)");
                 break;
            case 4:
                System.out.println("Bulan: April (bulan ke-4)");
                break;
            case 5:
                 System.out.println("Bulan: Mei (bulan ke-5)");
                 break;
            case 6:
                System.out.println("Bulan: Juni (bulan ke-6)");
                break;
            case 7:
                 System.out.println("Bulan: Juli (bulan ke-7)");
                 break;
            case 8:
                 System.out.println("Bulan: Agustus (bulan ke-8)");
                 break;
            case 9:
                System.out.println("Bulan: September (bulan ke-9)");
                break;
            case 10:
                 System.out.println("Bulan: Oktober (bulan ke-10)");
                 break;
            case 11:
                System.out.println("Bulan: November (bulan ke-11)");
                break;
            case 12:
                 System.out.println("Bulan: Desember (bulan ke-12)");
                 break;
            default:
                System.out.println("Angka bulan tidak valid (1-12)");
                break;
        }
        //menentukan jumlah hari menggunakan fall through
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                System.out.println("Jumlah hari: " + jumlahHari + " hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                System.out.println("Jumlah hari: " + jumlahHari + " hari");
                break;
            case 2:
                jumlahHari = 28;
                System.out.println("Jumlah hari: " + jumlahHari + " hari");
                break;
            default:
                System.out.println("Angka bulan tidak valid (1-12)");
                break;
        }
    }
}
