package JOBSHEET7;

import java.util.Scanner;

public class Utama14 {
    public static void main(String[] args) {
        Gudang14 gudang14 = new Gudang14(7);
        Scanner scanner14  = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.print("pilih operasi: ");
            int pilihan =scanner14.nextInt();
            scanner14.nextLine();

            switch (pilihan) {
                case 1: 
                    System.out.print("masukkan kode barang  : ");
                    int kode = scanner14.nextInt();
                    scanner14.nextLine();
                    System.out.print("masukkan nama barang  : ");
                    String nama = scanner14.nextLine();
                    System.out.print("masukkan nama kategori: ");
                    String jenis = scanner14.nextLine();
                    Barang14 barangBaru = new Barang14(kode, nama, jenis);
                    gudang14.tambahBarang(barangBaru);
                    break;
            
                case 2:
                    gudang14.ambilBarang();
                    break;
                case 3:
                    gudang14.tampilkanBarang();
                case 4:
                    break;
                default: 
                System.out.println("Pilihan tidak valid! silahkan coba kembali");
            }
        }
    }
    
}
