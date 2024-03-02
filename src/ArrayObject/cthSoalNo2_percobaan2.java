package ArrayObject;

public class cthSoalNo2_percobaan2 {
    public static void main(String[] args) {
        class orang {
            String nama;
            int usia;
            public orang(String nama, int usia) {
                this.nama = nama;
                this.usia = usia;}
        }
        orang[] org = new orang[3];
        org[0] = new orang("Budi", 20);
        org[1] = new orang("Ani", 21);
        org[2] = new orang("Cici", 22);
        System.out.println(org[0].nama);
        for (orang orang : org) {
            System.out.println("Nama: " + orang.nama);
            System.out.print("Usia: " + orang.usia);
            System.out.println();
        }
    }
}
