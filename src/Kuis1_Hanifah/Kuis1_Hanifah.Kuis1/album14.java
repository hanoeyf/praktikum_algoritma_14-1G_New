package Kuis1_Hanifah.Kuis1;

public class album14 {
    public String judul14;
    public String penyanyi14;
    public int jumlah14;
    public int harga14;

    public album14() {
    }

    public album14(String j, String p, int jm, int hr) {
        judul14 = j;
        penyanyi14 = p;
        jumlah14 = jm;
        harga14 = hr;
    }

    public void tampil() {
        System.out.println();
    }

    public int hitungPenjualan() {
        return jumlah14 * harga14;

    }

    public static void cariAlbumTerlaris(album14[] listAlbum) {
        album14 terlaris = listAlbum[0];
        for (int i = 1; i < listAlbum.length; i++) {
            if (listAlbum[i].jumlah14 >  terlaris.jumlah14) {
                terlaris = listAlbum[i];
            }
        }
        System.out.print("Album Terlaris adalah : ");
        terlaris.tampil();
    }

    public void daftarAlbum() {

    }
}
