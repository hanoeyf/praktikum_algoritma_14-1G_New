
package belajar;

public class DaftarMenu {
    public String nama;
    public int harga;
    public int jumlah;
    public int pesanan;
    public int totalPesanan;

    public DaftarMenu(String n, int h, int j) {
        nama = n;
        harga = h;
        jumlah = j;

    }

    public int hitungPesanan(int h, int p, int t) {
        harga = h;
        pesanan = p;
        totalPesanan = t;
        totalPesanan = harga * pesanan;
        return totalPesanan ;
    }
}
