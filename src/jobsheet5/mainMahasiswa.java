package jobsheet5;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args) {
        daftarMhaasiswaBerprestasi list = new daftarMhaasiswaBerprestasi();

        namaMahasiswa mhs1 = new namaMahasiswa("nusa", 2017, 25, 3);
        namaMahasiswa mhs2 = new namaMahasiswa("rara", 2012, 19, 4);
        namaMahasiswa mhs3 = new namaMahasiswa("dompu", 2018, 19, 3.5);
        namaMahasiswa mhs4 = new namaMahasiswa("abdul", 2017, 23, 2);
        namaMahasiswa mhs5 = new namaMahasiswa("ummi", 2019, 21, 3.75);
        list.tambah(mhs1);
        list.tambah(mhs2);
        list.tambah(mhs3);
        list.tambah(mhs4);
        list.tambah(mhs5);

        System.out.println("=============== Data sebelum diurutkan: ================");
        list.tampil();
        list.bubleSort();
        System.out.println("========================================================");
        System.out.println("====== Data setelah diurutkan berdasarkan IPK: =========");
        list.tampil();
    }
}
