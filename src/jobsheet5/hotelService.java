package jobsheet5;

public class hotelService {
    
    hotel[] rooms= new hotel[5];
     int totalPenginapan;
    public void tambah(hotel H) {
        rooms[totalPenginapan++] = H;
    }

    public void tampilAll() {
        for (int i = 0; i < totalPenginapan; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama);
            System.out.println("Kota      : " + rooms[i].kota);
            System.out.println("Harga     : " + rooms[i].harga);
            System.out.println("Bintang   : " + rooms[i].bintang);
            System.out.println();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < totalPenginapan-1; i++) {
            for (int j = 0; j < totalPenginapan-i-1; j++) {
                if (rooms[j].harga > rooms[j+1].harga) {
                    hotel temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }
    

    public void selectionSort() {
        for (int i = 0; i < totalPenginapan-1; i++) {
            int indeksMinimum = i;
            for (int j = i+1; j < totalPenginapan; j++) {
                if (rooms[j].bintang > rooms[indeksMinimum].bintang) {
                    indeksMinimum = j;
                }
            }
            hotel temp = rooms[indeksMinimum];
            rooms[indeksMinimum] = rooms[i];
            rooms[i] = temp;
        }
    }
}
