package jobsheet5;

public class namaMahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    namaMahasiswa (String n, int t, int u, double i){
        nama=n;
        thnMasuk=t;
        umur=u;
        ipk=i;
    }
    void tampil(){
        System.out.println("nama = "+nama);
        System.out.println("tahun masuk = " + thnMasuk);
        System.out.println("umur = "+umur);
        System.out.println("IPK= "+ipk);
    }
}
