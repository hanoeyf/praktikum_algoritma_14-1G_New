package jobsheet5;

public class mainHotel {
    public static void main(String[] args) {
                hotelService service = new hotelService();
        
                service.tambah(new hotel("Hotel A", "palembang", 600000, (byte)4));
                service.tambah(new hotel("Hotel B", "Malang", 160000, (byte)2));
                service.tambah(new hotel("Hotel C", "Medan", 900000, (byte)5));
                service.tambah(new hotel("Hotel D", "Surabaya", 80000, (byte)1));
                service.tambah(new hotel("Hotel E", "jakarta", 400000, (byte)3));
                
                System.out.println("==================================");
                System.out.println("Sebelum sorting berdasarkan harga:");
                System.out.println("==================================");
                service.tampilAll();
                service.bubbleSort();
                System.out.println("==================================");
                System.out.println("Setelah sorting berdasarkan harga:");
                System.out.println("==================================");
                service.tampilAll();
                System.out.println("====================================");
                System.out.println("Sebelum sorting berdasarkan bintang:");
                System.out.println("====================================");
                service.tampilAll();
                service.selectionSort();
                System.out.println("====================================");
                System.out.println("Setelah sorting berdasarkan bintang:");
                System.out.println("====================================");
                service.tampilAll();
            }
        }
    
