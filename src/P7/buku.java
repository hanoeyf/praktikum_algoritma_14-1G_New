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
    System.out.println("kode buku    \t:"+kodeBuku);
    System.out.println("judul buku   \t: "+judulBuku);
    System.out.println("tahun terbit \t: "+tahunTerbit);
    System.out.println("Pengarang    \t: "+pengarang);
    System.out.println("Stok         \t: "+stock);
}

    
}
