package P7;

public class pencarianBuku14 {
    buku listBk[]= new buku[2];
    int idx;
    void tambah (buku m){
        if (idx < listBk.length){
            listBk [idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh!");
        }
    }
    public 
    void tampil(){
        for (buku m : listBk){
            if(m != null){
            m.tampilDataBuku();
        }}
    }
    public int findSeqSearch (int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    public void tampilPosisi (int x, int pos){
        if (pos!=-1){
            System.out.println("data : "+ x + " ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }
    public void tampilData (int x, int pos){
        if (pos != -1) {
            System.out.print("kode buku    \t: "+ x);
            System.out.print("judul buku   \t: "+listBk[pos].judulBuku);
            System.out.print("tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.print("Pengarang    \t: "+listBk[pos].pengarang);
            System.out.print("Stok         \t: "+listBk[pos].stock);
    }else{
        System.out.println("data "+ x +"tidak ditemukan");
    }
}
} 