package ArrayObject;
import java.util.Scanner;
public class arrayOfObject {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int n = sc14.nextInt();
        persegiPanjang[] arrayPP = new persegiPanjang[n];

        for (int i = 0; i < n; i++) {
            arrayPP[i] = new persegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            arrayPP[i].panjang = sc14.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayPP[i].lebar = sc14.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + arrayPP[i].panjang + ", Lebar: " + arrayPP[i].lebar);
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
