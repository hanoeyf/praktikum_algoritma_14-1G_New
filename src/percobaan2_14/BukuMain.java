package percobaan2_14;

public class BukuMain {
    public static void main(String[] args) {
    Buku14 bk1=new Buku14();
    bk1.judul=" Today Ends ataomorrow Comes";
    bk1.pengarang="Denanda Pratiwi";
    bk1.halaman=198;
    bk1.stok=13;
    bk1.harga=71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilInformasi();

    Buku14 bk2= new Buku14( "self reward", "maheera ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    Buku14 bkHanifah = new Buku14("selalu Bahagia", "Hanifah Kurniasari", 290, 90, 70000);
    bkHanifah.terjual(88);
    bkHanifah.tampilInformasi();
}
}