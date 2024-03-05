package bangunRuang;

import java.util.Scanner;

public class mainBangunRuang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data bola (jari-jari): ");
        double jariBola = scanner.nextDouble();
        bola bola = new bola(jariBola);

        System.out.println("Masukkan data kerucut (jari-jari, sisi miring): ");
        double jariKerucut = scanner.nextDouble();
        double sisiMiringKerucut = scanner.nextDouble();
        kerucut kerucut = new kerucut(jariKerucut, sisiMiringKerucut);

        System.out.println("Masukkan data limas segi empat (sisi alas, tinggi limas): ");
        double sisiAlasLimas = scanner.nextDouble();
        double tinggiLimas = scanner.nextDouble();
        limasSegi4 limas = new limasSegi4(sisiAlasLimas, tinggiLimas);

        System.out.println("\n===========");
        System.out.println("Hasil Bola:");
        System.out.println("Luas permukaan: " + bola.hitungLuasAlas());
        System.out.println("Volume: " + bola.hitungVolume());

        System.out.println("\n===========");
        System.out.println("Hasil Kerucut:");
        System.out.println("Luas permukaan: " + kerucut.hitungLuasAlas());
        System.out.println("Volume: " + kerucut.hitungVolume());

        System.out.println("\n===========");
        System.out.println("Hasil Limas Segi Empat:");
        System.out.println("Luas permukaan: " + limas.hitungLuasAlas());
        System.out.println("Volume: " + limas.hitungVolume());
    }
}
