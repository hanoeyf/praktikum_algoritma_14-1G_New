package JOBSHEET7;

public class Gudang14 {
    Barang14[] tumpukan;
    int size,top;

public Gudang14(int kapasitas){
    size=kapasitas;
    tumpukan= new Barang14[size];
    top=-1;
}
public boolean cekKosong(){
    if(top==-1) {
        return true;
    } else { 
        return false;
    }
}
public boolean cekPenuh(){
    if (top == size - 1) {
        return true;
} else{
    return false;
}
}
public void tambahBarang (Barang14 brg){ //push
 if (!cekPenuh()) {
     top++;
     tumpukan [top] = brg;
   System.out.println("barang "+ brg.nama + " berhasil ditambahkan ke gudang");
}else {
    System.out.println("gagal! tumpukan barang sudah penuh");
}
}
public  Barang14 ambilBarang () { //pop
    if(!cekKosong()){
        Barang14 delete = tumpukan[top];
        top--;
        System.out.println("barang "+ delete.nama + " diambil dari gudang");
        return delete;
    }else{
        System.out.println("tumpukkan barang kosong");
        return null;
    }
}
public Barang14 lihatBarangTeratas(){
    if(top==-1){
        Barang14 barangTeratas = tumpukan[top];
        System.out.println("barang teratas: "+ barangTeratas.nama);
        return barangTeratas;
    }else{
        System.out.println("tumpukan barang kosong");
        return null;
    }
}
public void tampilkanBarang(){
    if (!cekKosong()){
        System.out.println("rincian tumpukan barang di gudang: ");
        for (int i = top; i >= 0 ; i--) {
            System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
            tumpukan[i].jenis);            
        }
    } else{
        System.out.println("tumpukkan barangg koseng");
    }
    }}