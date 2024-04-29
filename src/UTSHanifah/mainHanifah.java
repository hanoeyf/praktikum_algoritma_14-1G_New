package UTSHanifah;
import java.util.Scanner;
public class mainHanifah {
    public static void main(String[] args) {
        pencarianHanifah datHanifah = new pencarianHanifah();
        int jmlSiswa = 6;
        Scanner scHanifah = new Scanner(System.in);
        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("========Masukkan data siswa========");
            System.out.println("masukkan NISN siswa: " );
            String  nisnHanifah = scHanifah.nextLine();
            System.out.println("masukkan nama siswa: " );
            String  namaHanifah = scHanifah.nextLine();
            System.out.println("masukkan Alamat siswa: " );
            String  alamatHanifah = scHanifah.nextLine();
            System.out.println("masukkan Tahun siswa: " );
            int tahunHanifah= scHanifah.nextInt();
            
            System.out.println("masukkan Nilai siswa: " );
            double nilaiHanifah= scHanifah.nextDouble();
        } 
        System.out.println("DAFTAR INFORMASI SISWA");
        

        System.out.println(" PENCARIAN ELEMEN BERDASARKAN NISN SISWA");
        int posisi=datHanifah.findSeqSearchHanifah(jmlSiswa);

        System.out.println("PENGURUTAN DATA BERDASARKAN NILAI");
        datHanifah.bubleSortHanifah(jmlSiswa,posisi);
        
    }
}