import java.util.Scanner;

public class mahasiswa_jobsheet3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswas = new Mahasiswa[3];
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); 
            mahasiswas[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        double rataRataIpK = hitungRataRataIpK(mahasiswas);

        Mahasiswa mahasiswaIpKTertinggi = MahasiswaIpKTertinggi(mahasiswas);

        System.out.println("\nRata-rata IPK: " + rataRataIpK);
        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaIpKTertinggi.nama);
        System.out.println("NIM: " + mahasiswaIpKTertinggi.nim);
        System.out.println("Jenis kelamin: " + mahasiswaIpKTertinggi.jenisKelamin);
        System.out.println("Nilai IPK: " + mahasiswaIpKTertinggi.ipk);
    }

    private static double hitungRataRataIpK(Mahasiswa[] mahasiswas) {
        double totalIpK = 0;
        for (Mahasiswa mahasiswa : mahasiswas) {
            totalIpK += mahasiswa.ipk;
        }
        return totalIpK / mahasiswas.length;
    }

    private static Mahasiswa MahasiswaIpKTertinggi(Mahasiswa[] mahasiswas) {
        Mahasiswa mahasiswaIpKTertinggi = mahasiswas[0];
        for (int i = 1; i < mahasiswas.length; i++) {
            if (mahasiswas[i].ipk > mahasiswaIpKTertinggi.ipk) {
                mahasiswaIpKTertinggi = mahasiswas[i];
            }
        }
        return mahasiswaIpKTertinggi;
    }
}

class Mahasiswa {

    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}
