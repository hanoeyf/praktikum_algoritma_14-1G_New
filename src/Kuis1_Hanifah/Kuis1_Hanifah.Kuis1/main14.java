package Kuis1_Hanifah.Kuis1;

import java.util.Scanner;

public class main14 {

    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        album14 [] ArrayAlbum= new album14[5];
        for (int i = 0; i < ArrayAlbum.length; i++) {
            ArrayAlbum  [i] = new album14();
            System.out.println("album ke-" + (i+1));
            System.out.println("Masukkan judul album: ");
            ArrayAlbum[i].judul14=sc14.nextLine();
            System.out.println("masukkan nama penyanyi: " );
            ArrayAlbum[i].penyanyi14=sc14.nextLine();
            System.out.println("Masukkan jumlah album terjual: ");
            ArrayAlbum[i].jumlah14=sc14.nextInt();
            System.out.println("masukkan harga: " );
            ArrayAlbum[i].harga14=sc14.nextInt();
            System.out.println();
       System.out.println("total penjualan album ke- "+ (i+1) +": "+ ArrayAlbum[i].hitungPenjualan()); 
       album14.cariAlbumTerlaris(ArrayAlbum);  
    }
}
}
