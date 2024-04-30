package praktikum1;

import java.util.Scanner;

public class QueueMain {
    Scanner sc14 = new Scanner(System.in);
    public static void menu() {
        System.out.println("masukkan operasi yan diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Exit");
        System.out.println("--------------------");
        }
    public static void main(String[] args) {
    Scanner sc14= new Scanner(System.in);
    int pilih;
    System.out.print("masukkan kapasitas queue: ");
    int n= sc14.nextInt();
    Queue Q =new Queue(n);
    
    
    do{
        menu();
        pilih=sc14.nextInt();
        switch (pilih){
            case 1 :
                System.out.print("masukkan data baru: ");
                int dataMasuk= sc14.nextInt();
                Q.enqueue(dataMasuk) ;
                break;
            case 2: 
                int dataKeluar = Q.Dequeue() ;
                if(dataKeluar != 0)
                    System.out.println("Data yang dikeluarkan:  "+dataKeluar);
                    break;
            case 3: 
                Q.print();
                break;
            case 4:
                Q.peek();
                break;
            case 5:
                Q.clear();
                break;
        
          }
         
     }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
     System.exit(0);}}