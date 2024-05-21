package Kuis2_HanifahKurniasari_14;
import java.util.Scanner;
        public class main_14 {
                public static void menu() {
                    System.out.println("===============================================");
                    System.out.println("Sistem Antrian Resto");
                    System.out.println("1. Tambah antrian");
                    System.out.println("2. Cetak antrian");
                    System.out.println("3. Hapus antrian");
                    System.out.println("4. Laporan pengurutan pesanan by nama");
                    System.out.println("5. Hitung total pesanan");
                    System.out.println("6. Keluar");
                    System.out.println("===============================================");
                    System.out.print("Masukkan pilihan anda: ");
                }
                public static void main(String[] args) throws Exception {
                    Scanner input = new Scanner(System.in);
                   doubleLinkesList14 dml = new doubleLinkesList14();
                    boolean running = true;
                    System.out.println("=============QUIZ 2 PRAKTIKUM ASD TI============");
                    System.out.println("Dibuat oleh: Hanifah Kurniasari");
                    System.out.println("NIM: 241720254");
                    System.out.println("Absen: 14");
                    while (running) {
                        menu();
                        int pilihan14 = input.nextInt();
                        input.nextLine();
            
                        switch (pilihan14) {
                        
                            case 1:
                            System.out.println("-------------------------");
                            System.out.println("masukkan data pembeli");
                            System.out.println("-------------------------");
                            System.out.println("nomor antrian : 1");
                            System.out.println("masukkan nama : hanifah ");
                            System.out.println("no.hp         : 098765");
                            dml.addFirst(pilihan14);
                
                            System.out.println("-------------------------");
                            System.out.println("nomor antrian : 2");
                            System.out.println("masukkan nama : dina ");
                            System.out.println("no.hp         : 0980005");
                            dml.addLast(pilihan14);
            
                            System.out.println("-------------------------");
                            System.out.println("nomor antrian : 3");
                            System.out.println("masukkan nama : luna ");
                            System.out.println("no.hp         : 4520005");
                            dml.addLast(pilihan14);
            
                            System.out.println("-------------------------");
                            System.out.println("nomor antrian : 4");
                            System.out.println("masukkan nama : rena ");
                            System.out.println("no.hp         : 9480005");
                            dml.addLast(pilihan14);
                           
                                break;
            
                            case 2:
                                System.out.println("===============================================");
                                System.out.println(" Data antrian:");
                                dml.print();

                                break;
            
                            case 3:
                            dml.removeFirst();
                            
                                break;
            
                            case 4:
                        
                                break;
            
                            case 5:
                               
                                break;
            
                            case 6:
                                running = false;
                                break;
            
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
            
                    input.close();
        }
    }





