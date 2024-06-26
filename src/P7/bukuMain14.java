package P7;

import java.util.Scanner;

public class bukuMain14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        pencarianBuku14 data = new pencarianBuku14();
        int jmlBuku = 5;
        System.out.println("=====================================");
        System.out.println("masukkan data buku secara urut dari kode buku terkecil! ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("--------------------------");
            System.out.print("kode buku    \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("judul buku   \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang    \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok         \t: ");
            int stok = s.nextInt();
            buku m = new buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("=====================================");
        System.out.println("       data keseluruhan buku: ");
        System.out.println("=====================================");
        data.tampil();
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("prncarian data: ");
        System.out.println("masukkan kode buku yang di cari: ");
        System.out.print("kode buku: ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("=====================================");
        System.out.println("Cari buku berdasarkan Buku14: ");
        System.out.print("Buku14: ");
        int Buku14 = s.nextInt();
        buku bukuDitemukan = data.findBuku(Buku14);
        if (bukuDitemukan != null) {
            System.out.println("Buku ditemukan:");
            bukuDitemukan.tampilDataBuku();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
        System.out.println("=====================================");
        System.out.println("menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0, jmlBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}