import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        String  nilaiHuruf;
        System.out.println("============================");
        System.out.println("  Masukkan Nilai Mahasiswa: "); 
         System.out.println("============================");
        
            System.out.print("Nilai uas   :");
           float uas = input14.nextFloat();
           if (uas <0 || uas >100){
            System.out.println("nilai harus dalam rentang 0-100, masukkan nilai kembali: ");
            uas = input14.nextFloat();
            System.out.println("Nilai uas: "+uas);
        }
           System.out.print("Nilai uts   :");
            float uts = input14.nextFloat();
           if (uts <0 || uts >100){
            System.out.println("nilai harus dalam rentang 0-100, masukkan nilai kembali: ");
            uts  = input14.nextFloat();
            System.out.println("Nilai uts  : "+uts);
        }
        
           System.out.print("Nilai kuis  :");
           float kuis = input14.nextFloat();
            if (kuis <0 || kuis >100){
            System.out.println("nilai harus dalam rentang 0-100, masukkan nilai kembali: ");
            kuis  = input14.nextFloat();
            System.out.println("Nilai kuis  : "+kuis);
        }
           System.out.print("Nilai tugas :");
           float tugas = input14.nextFloat();
            if (tugas <0 || tugas >100){
            System.out.println("Nilai tidak valid!! nilai harus dalam rentang 0-100, masukkan nilai kembali: ");
            tugas = input14.nextFloat();
            System.out.println("Nilai tugas  : "+tugas);
            System.out.println("================================");
        }
        System.out.println("================================");
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.2F) + (tugas * 0.2F);
        if (total > 80){
               nilaiHuruf= "A";
                System.out.println( "Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf); 
              }
        
                else if (total > 73){
                 nilaiHuruf= "B+";
                 System.out.println("Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf);
                 }
        
                 else if (total > 65){
                 nilaiHuruf= "B";
                 System.out.println("Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf);
                 }
        
                 else if (total > 60){
                 nilaiHuruf= "C+";
                 System.out.println("Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf);
                 }
        
                 else if (total > 50){
                 nilaiHuruf= "C";
                 System.out.println("Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf);
                 }
        
                 else if (total > 39){
                 nilaiHuruf= "D";
                 System.out.println("Nilai Huruf Mahasiswa Adalah : " + nilaiHuruf);
                 }
        
                 else if (total <= 39 ){
                 nilaiHuruf= "E";
                 System.out.println("Predikat Mahasiswa Adalah : " + nilaiHuruf);
                 }
                 System.out.println("================================");
           String message = total > 50 ? "LULUS!" : "TIDAK LULUS";
           System.out.println("Nilai akhir = " + total + "\nMahasiswa dinyatakan " + message);
           System.out.println("================================");
           
    }
}