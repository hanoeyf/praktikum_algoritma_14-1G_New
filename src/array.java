
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
   
        Scanner sc14 = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("  Masukkan nilai masing-masing matkul untuk menghitung IP anda ");
        System.out.println("================================================================");
        System.out.print("nilai Pancasila                             :");
        double pancasila = sc14.nextDouble();
        System.out.print("nilai Konsep Teknologi Informasi            :");
        double KTI = sc14.nextDouble();
        System.out.print("nilai Critical Thinking and Problem Solving :");
        double CTPS = sc14.nextDouble();
        System.out.print("nilai Matematika Dasar                      :");
        double MatDas = sc14.nextDouble();
        System.out.print("nilai Bahasa Inggris                        :");
        double bing = sc14.nextDouble();
        System.out.print("nilai Dasar Pemrograman                     :");
        double DasPro = sc14.nextDouble();
        System.out.print("nilai Praktikum Dasar Pemrograman           :");
        double PrakDasPro = sc14.nextDouble();
        System.out.print("nilai Keselamatan dan Kesehatan Kerja       :");
        double K3 = sc14.nextDouble();
        String[] namaMatkul = { "Pancasila", "KTI", "CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Prak. DasPro", "K3" };
        double[] nilaiMatkul = { pancasila, KTI, CTPS, MatDas, bing, DasPro, PrakDasPro,K3 };
        String[] konversiIP = new String[8];
        double[] bobotNilai = new double[8];
        

        for (int i = 0; i < 8; i++) {
            konversiIP[i] = nilaiHuruf(nilaiMatkul[i]);
            bobotNilai[i] = nilaiSetara(nilaiMatkul[i]);
        }
        double ipSemester = hitungIP(bobotNilai);

        System.out.println("===================================================================");
        System.out.println("    Mata Kuliah     Nilai Mata Kuliah   nilai huruf   nilai setara ");
        System.out.println("===================================================================");
        for (int i = 0; i < 8; i++) {
            System.out.printf("    %-20s %-17.2f  %-8s  %-5.2f \n", namaMatkul[i], nilaiMatkul[i], konversiIP[i], bobotNilai[i]);
        }
        System.out.println("===================================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
static String nilaiHuruf(double nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 75) {
            return "A-";
        } else if (nilai >= 70) {
            return "B+";
        } else if (nilai >= 65) {
            return "B";
        } else if (nilai >= 60) {
            return "B-";
        } else if (nilai >= 55) {
            return "C+";
        } else if (nilai >= 50) {
            return "C";
        } else if (nilai >= 45) {
            return "D";
        } else {
            return "E";
        }
    }
  static double nilaiSetara(double nilai) {
        if (nilai >= 80) {
            return 4.0;
        } else if (nilai >= 75) {
            return 3.7;
        } else if (nilai >= 70) {
            return 3.3;
        } else if (nilai >= 65) {
            return 3.0;
        } else if (nilai >= 60) {
            return 2.7;
        } else if (nilai >= 55) {
            return 2.3;
        } else if (nilai >= 50) {
            return 2.0;
        } else if (nilai >= 45) {
            return 1.5;
        } else {
            return 0.0;
        }
    }
static double hitungIP(double[] bobotNilai) {
        double totalBobot = 0;
        for (double bobot : bobotNilai) {
            totalBobot += bobot;
        }
        return totalBobot / bobotNilai.length;
    }
}
