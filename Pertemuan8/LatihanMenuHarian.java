//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042


package Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI === ");
        for (int hari = 1; hari <= 3; hari++){ //outer loop hari
            System.out.println("Hari " + hari + ":");
            for(int waktu = 1; waktu<= 2; waktu++){ //inner loop waktu makan
                switch (waktu){ 
                    case 1:
                        if(hari == 1){
                            System.out.println("Pagi: Nasi Goreng");
                        } else if (hari == 2){
                            System.out.println("Pagi: Bubur Ayam");
                        } else if (hari == 3){
                            System.out.println("Pagi: Roti Bakar");
                        }
                        break;
                    case 2:
                        if(hari == 1){
                            System.out.println("Siang: Soto Ayam");
                        } else if (hari == 2){
                            System.out.println("Siang: Mie Goreng");
                        } else if (hari == 3){
                            System.out.println("Siang: Nasi Uduk");
                        }
                        break;
                }
            }
             System.out.println();
        }
    }
}
