package Minggu5;
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.print("program menghitunga keuntungan total (satuan jt. misal 5.9)");
        System.out.println("masukkan jumlah bulan : ");
        int elm = sc14.nextInt();
    
        sum sm = new sum(elm);
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < elm; i++) {
            System.out.println("masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc14.nextDouble();
        }
    
        System.out.println("============================================");
        System.out.println("algoritma Brute Force");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("---------------------------------------------");
        System.out.println("algoritma divide conquer");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    
    }}
