package P7;
public class pencarianBuku14 {
    buku listBk[]= new buku[5];
    int idx;
    void tambah (buku m){
        if (idx < listBk.length){
            listBk [idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh!");
         } }
    public void tampil(){
        for (buku m : listBk){
            if(m != null){
            m.tampilDataBuku();
        }} }
    public int findSeqSearch (int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari){
                posisi=j;
                break;
            } }
        return posisi;
    }
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >=left) {
            mid = left +(right-left)/2;
            if (cari==listBk[mid].kodeBuku){
                return mid;
                }else if ( listBk[mid].kodeBuku > cari ){
                    return findBinarySearch(cari, left, mid-1);
                }else {
                return findBinarySearch(cari, mid +1, right);           
                 }
             }
             return -1;
    }
    public void tampilPosisi (int x, int pos){
        if (pos!=-1){
            System.out.println("data : "+ x + " ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data "+ x +" tidak ditemukan");
        } }
    public void tampilData (int x, int pos){
        if (pos != -1) {
            System.out.println("kode buku    \t: "+ x);
            System.out.println("judul buku   \t: "+listBk[pos].judulBuku);
            System.out.println("tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang    \t: "+listBk[pos].pengarang);
            System.out.println("Stok         \t: "+listBk[pos].stock);
    }else{
        System.out.println("data "+ x +"tidak ditemukan");
    }
}
public buku findBuku(int BukuNoAbsen) {
    int posisi = findSeqSearch(BukuNoAbsen);
    if (posisi != -1) {
        return listBk[posisi];
    } else {
        return null;
    }
}
}
