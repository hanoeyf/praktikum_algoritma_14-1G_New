package percobaan2_14;
public class Buku14{
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("judul: "+judul);
        System.out.println("pengarang: "+pengarang);
        System.out.println("halaman: "+halaman);
        System.out.println("sisa stok: "+stok);
        System.out.println("harga: "+harga);
    }
    void terjual(int jumlah){
        if (stok>0){
        stok-=jumlah;}
        else {System.out.println("stok habis");}

    }
    void restock(int jumlah){
        stok += jumlah;
    }
    void gantiHarga(int hrg){
        harga=hrg;
    }
    public Buku14(){

    }
    public Buku14(String jd, String pg, int hm, int stok, int hr) {
        judul=jd;
        pengarang=pg;
        halaman=hm;
        this.stok=stok;
        harga=hr;
    }
}