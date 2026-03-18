//Nama: Tiara Zalfa Dzakiyah
//NIM: D1041241042

package Pertemuan12;
class Mahasiswa{
    static int jumlahMahasiswa = 0;
    String nama;

    Mahasiswa(String nama){ //constructor mahasiswa untuk menambahkan jumlah mahasiswa
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }
    //statis method getJumlah() untuk mengembalikan jumlah
    static int getJumlah(){
        return jumlahMahasiswa;
    }
}

public class StaticCounter{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Andi"); //object 1
        Mahasiswa mhs2 = new Mahasiswa("Budi"); //object 2
        Mahasiswa mhs3 = new Mahasiswa("Citra");//object 3
        
        System.out.println();
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}