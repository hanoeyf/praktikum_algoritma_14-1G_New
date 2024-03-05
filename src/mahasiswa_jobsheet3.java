
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
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswas[i].nama);
            System.out.println("NIM: " + mahasiswas[i].nim);
            System.out.println("Jenis kelamin: " + mahasiswas[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mahasiswas[i].ipk);
        }
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
