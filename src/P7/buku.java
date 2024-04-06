package P7;

public class buku {
    int kodeBuku,tahunTerbit, stock;
    String judulBuku, pengarang;
public buku(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
    this.kodeBuku=kodeBuku;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.pengarang = pengarang;
    this.stock = stock;
}
public void tampilDataBuku (){
    System.out.println("========================");
    System.out.println("kode buku    :"+kodeBuku);
    System.out.println("judul buku   : "+judulBuku);
    System.out.println("tahun terbit : "+tahunTerbit);
    System.out.println("Pengarang    : "+pengarang);
    System.out.println("Stok         : "+stock);
}

    
}
