package percobaan2_14;
public class Buku14{
    String judul, pengarang;
    int halaman, stok, harga;
    double diskon, hargaBayar;

    void tampilInformasi(){
        System.out.println("judul: "+judul);
        System.out.println("pengarang: "+pengarang);
        System.out.println("halaman: "+halaman);
        System.out.println("sisa stok: "+stok);
        System.out.println("harga: "+harga);
        System.out.println("harga bayar: "+ hargaBayar);
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
    int hitungHargaTotal(int jumlahTerjual){
         return harga * jumlahTerjual;
  
        
    }
    double hitungDiskon(int hargaTotal){
        System.out.println(hargaTotal);
        if (hargaTotal>150000){
            return 0.12*hargaTotal;
        } else if (hargaTotal > 75000 && hargaTotal<150000) {
           return 0.05* hargaTotal;
        } else {
            return 0;
        }
    }
    double hitungHargaBayar(int hargaTotal, double diskon){
        hargaBayar = hargaTotal;
        return hargaBayar;
        
        
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