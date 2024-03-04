package segitiga;

public class main_segitiga {
    public static void main(String[] args) {
     segitiga_soal2[] sgArray= new segitiga_soal2[4];
     sgArray[0]=new segitiga_soal2(10, 4);
     sgArray[1]=new segitiga_soal2(20,10);
     sgArray[2]=new segitiga_soal2(15,6);
     sgArray[3]=new segitiga_soal2(25,10);
     for (int i = 0; i < sgArray.length; i++) {
        System.out.println("Segitiga ke-" + (i + 1));
        System.out.println("Luas: " + sgArray[i].hitungLuas());
        System.out.println("Keliling: " + sgArray[i].hitungKeliling());
        System.out.println();}
    }
    
}
