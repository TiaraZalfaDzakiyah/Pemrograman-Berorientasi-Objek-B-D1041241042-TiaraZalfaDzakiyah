//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan12;
class Sekolah{
    static String namaSekolah; //nama sekolah yang merupakan static atribute
    
    Sekolah(String nama){
        namaSekolah = nama;
    }
    
    class Kelas{ //inner class kelas
        String namaKelas;

        Kelas(String namaKelas){
            this.namaKelas = namaKelas;
        }
        public void info(){
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
      Sekolah sekolah = new Sekolah("SMA Negeri 1"); //mengakses outer class
      Sekolah.Kelas sekolah1 = sekolah.new Kelas("X-A"); //mengakses inner class melalui outer class
      sekolah1.info();   //memanggil method melalui object inner class
    }
}
