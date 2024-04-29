package belajar;

import java.util.Scanner;

public class MainBelajar {
    public static void main(String[] args) {

        DaftarMenu Am[] = new DaftarMenu[2];
        Am[0] = new DaftarMenu("ayam", 30000, 5);
        Am[1] = new DaftarMenu("mie", 20000, 4);
        for (int i = 0; i < Am.length; i++) {
            System.out.println("menu ke-" + (i + 1));
            System.out.println(Am[i].nama);
            System.out.println(Am[i].harga);
            System.out.println(Am[i].jumlah);

            System.out.println();
        }
    }
}
