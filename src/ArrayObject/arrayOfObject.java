package ArrayObject;

import java.util.Scanner;

public class arrayOfObject {
    public static void main(String[] args) {
        persegiPanjang[] arrayPP = new persegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arrayPP[i] = new persegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Maukkan panjang: ");
            arrayPP[i].panjang = sc.nextInt();
            System.out.print("masukkan lebar: ");
            arrayPP[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("panjang: " + arrayPP[i].panjang + ", lebar: " + arrayPP[i].lebar);
        }
        // arrayPP[0] = new persegiPanjang();
        // arrayPP[0].panjang = 110;
        // arrayPP[0].lebar = 30;

        // arrayPP[1] = new persegiPanjang();
        // arrayPP[1].panjang = 80;
        // arrayPP[1].lebar = 40;

        // arrayPP[2] = new persegiPanjang();
        // arrayPP[2].panjang = 100;
        // arrayPP[2].lebar = 20;

        // System.out.println("persegi panjang ke-1, panjang: " + arrayPP[0].panjang + ",  lebar: " + arrayPP[0].lebar);
        // System.out.println("persegi panjang ke-2, panjang: " + arrayPP[1].panjang + ",  lebar: " + arrayPP[1].lebar);
        // System.out.println("persegi panjang ke-3, panjang: " + arrayPP[2].panjang + ",  lebar: " + arrayPP[2].lebar);
    }
}
