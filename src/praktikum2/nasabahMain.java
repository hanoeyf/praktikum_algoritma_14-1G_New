package praktikum2;

import java.util.Scanner;

public class nasabahMain {
    public static void menu() {
        System.out.println("pilih menu: ");
        System.out.println( "1. Antrian baru");
        System.out.println( "2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("masukkan kapasitas queue: ");
        int jumlah = sc14.nextInt();
        nasabah14 antri = new nasabah14(jumlah);

        int pilih;
        do{
            menu();
            pilih=sc14.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("no.rek  : ");
                    String norek = sc14.nextLine();
                    sc14.nextLine();
                    System.out.print("nama    : ");
                    String nama = sc14.nextLine();
                    System.out.print("alamat  : ");
                    String alamat = sc14.nextLine();
                    System.out.print("umur    : ");
                    int umur = sc14.nextInt();
                    sc14.nextLine();
                    System.out.print("saldo   : ");
                    double saldo = sc14.nextDouble();
                    nasabah14 nb = new nasabah14 (norek, nama, alamat, umur, saldo );
                    sc14.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    nasabah14 data = antri.Dequeue() ;
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                             && !"".equals(data.umur) && !"".equals(data.saldo)) {
                        System.out.println("Antrian yang keluar: "+ data.norek + " "+ data.nama+ " "
                        +data.alamat+ " " + data.umur+" " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4: 
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
             }
    }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }}
