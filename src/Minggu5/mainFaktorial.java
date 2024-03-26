package Minggu5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int ijml = sc14.nextInt();
        faktorial[] fk= new faktorial[10];
        for (int i = 0; i < ijml; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1)+": ");
            int inilai= sc14.nextInt();
            fk[i].nilai = inilai;
        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < ijml; i++) {
            System.out.println("hasil perhitungan faktorial menggunakan Brute Force adalah: "+ fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DEVIDDE AND CONQUER:");
        for (int i = 0; i < ijml; i++) {
            System.out.println("hasil perhitungan faktorial menggunakan Devide and Conquer adalah: "+ fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
