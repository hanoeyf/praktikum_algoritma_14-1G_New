package UTSHanifah;

public class siswaHanifah {
    public String nisnHanifah, namaHanifah, alamatHanifah;
    public int tahunHanifah;
    public double nilaiHanifah;
public siswaHanifah(String ni, String n, String a, int t, double nil ){
    nisnHanifah=ni;
    namaHanifah=n;
    alamatHanifah =a;
    tahunHanifah=t;
    nilaiHanifah=nil;
}
public void tampilHanifah(){
    System.out.println("nisn siswa       : "+nisnHanifah);
    System.out.println("nama siswa       : "+namaHanifah);
    System.out.println("alamat siswa     : "+alamatHanifah);
    System.out.println("tahun masuk siswa: "+tahunHanifah);
    System.out.println("nilai siswa      : "+nilaiHanifah);
}
    
}
