package Pertemuan8;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 === ");
        for(int bilangan = 1; bilangan <= 20; bilangan++){
            if(bilangan % 2 != 0){
                continue;
            }
            total+=bilangan;
            System.err.println("Tambah: " + bilangan + " ---  Total: " + total);
        }
        System.out.println("---");
        System.out.println("Total akhir: "+ total);
    }
}
