package Minggu5;

import java.util.Scanner;

public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("masukkan jumlah elemen yang dihitung: ");
        int elemen = sc14.nextInt();
        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.println("masukkan nilai yang hendak dipangkatkan: ");
            png[i].angka = sc14.nextInt();
            System.out.println("masukkan nilai pangkat: ");
            png[i].pangkat = sc14.nextInt();

        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("hasil dari "
                    + png[i].angka + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].angka, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("hasil dari "
                    + png[i].angka + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].angka, png[i].pangkat));

        }
    }
}
