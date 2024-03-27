package Minggu5;
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
    Scanner sc14= new Scanner(System.in);
    System.out.println("masukkan jumlah perusahaan : ");
    int jumlahP = sc14.nextInt();
    double totalUntung=0;

    for (int i = 0; i < jumlahP; i++) {
        
    System.out.println("===========================================================");
    System.out.print("program menghitunga keuntungan total (satuan jt. misal 5.9)");
    System.out.println("masukkan jumlah bulan : ");
    int elm = sc14.nextInt();

    sum sm = new sum(elm);
    System.out.println("-----------------------------------------------------------");
    double[]keuntunganPerusahaan = new double[elm];
    for (int j = 0; j < elm; j++) {
        System.out.println("masukkan untung bulan ke - " + (j + 1) + " = ");
        keuntunganPerusahaan[j] = sc14.nextDouble();
        totalUntung+=keuntunganPerusahaan[j];
    }

    System.out.println("============================================");
    System.out.println("algoritma Brute Force");
    System.out.println("total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " +  sm.totalBF(keuntunganPerusahaan));
    System.out.println("---------------------------------------------");
    System.out.println("algoritma divide conquer");
    System.out.println("total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + String.format("%.2f", sm.totalDC(keuntunganPerusahaan, 0, sm.elemen - 1)));

}System.out.println("total untung semua perusahaan adalah "+ totalUntung);
}
}