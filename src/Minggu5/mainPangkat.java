package Minggu5;

import java.util.Scanner;
//commit ulang
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("masukkan jumlah elemen yang dihitung: ");
        int elemen = sc14.nextInt();
        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            
            System.out.println("masukkan nilai yang hendak dipangkatkan: ");
            int angka = sc14.nextInt();
            System.out.println("masukkan nilai pangkat: ");
            int pangkat = sc14.nextInt();
            png[i]= new pangkat(angka, pangkat);
        }
        System.out.println("===========================");
        System.out.println("Pilih metode: ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan: ");
        int metode = sc14.nextInt();
    
        switch (metode) {
            case 1:
            System.out.println("Hasil Pangkat Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("hasil dari "
                    + png[i].angka + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].angka, png[i].pangkat));
                }
                break;
            case 2:
            System.out.println("Hasil Pangkat Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("hasil dari "
                    + png[i].angka + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].angka, png[i].pangkat));
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
                break;
        }

        // System.out.println("HASIL PANGKAT - BRUTE FORCE");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("hasil dari "
        //             + png[i].angka + " pangkat "
        //             + png[i].pangkat + " adalah "
        //             + png[i].pangkatBF(png[i].angka, png[i].pangkat));
        // }
        // System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("hasil dari "
        //             + png[i].angka + " pangkat "
        //             + png[i].pangkat + " adalah "
        //             + png[i].pangkatDC(png[i].angka, png[i].pangkat));

        // }
    }
}
