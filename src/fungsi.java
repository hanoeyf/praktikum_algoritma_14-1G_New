public class fungsi {
    static final int bungaAglonema = 75000;
    static final int bungaKeladi   = 50000;
    static final int bungaAlocasia = 60000;
    static final int bungaMawar    = 10000;
    public static void main(String[] args) {
        int[][] stockBunga = {
                { 10, 5, 15, 7 }, // RoyalGarden 1
                { 6, 11, 9, 12 }, // RoyalGarden 2
                { 2, 10, 10, 5 }, // RoyalGarden 3
                { 5, 7, 12, 9 } // RoyalGarden 4
             };
        System.out.println("harga Aglonema = 75.000 ");
        System.out.println("harga Keladi   = 50.000 ");
        System.out.println("harga Alocasia = 60.000 ");
        System.out.println("harga Mawar    = 10.000");
        System.out.println("PENDAPATAN SETIAP CABANG JIKA SELURUH STOK BUNGA HABIS:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = pendapatan(stockBunga[i]);
            System.out.println("RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
            System.out.println("\nJumlah stock  bunga pada cabang RoyalGarden 4:");
            int cabang = 4; 
            System.out.println("Aglonema: " + stockBunga[cabang - 1][0]);
            System.out.println("Keladi  : " + stockBunga[cabang - 1][1]);
            System.out.println("Alocasia: " + stockBunga[cabang - 1][2]);
            System.out.println("Mawar   : " + stockBunga[cabang - 1][3]);
penguranganStock(stockBunga[cabang - 1], 1, 2, 0, 5);
        System.out.println("\nPengurangan jumlah stok karena mati:");
        System.out.println("Aglonema: " + stockBunga[cabang - 1][0]);
        System.out.println("Keladi  : " + stockBunga[cabang - 1][1]);
        System.out.println("Alocasia: " + stockBunga[cabang - 1][2]);
        System.out.println("Mawar   : " + stockBunga[cabang - 1][3]);
    }
      static void penguranganStock(int[] stock, int aglonema, int keladi, int alocasia, int mawar) {
        stock[0] -= aglonema;
        stock[1] -= keladi;
        stock[2] -= alocasia;
        stock[3] -= mawar;
    }
    static int pendapatan(int[] stockBunga) {
        int totPendapatan = 0;
        totPendapatan += stockBunga[0] * bungaAglonema;
        totPendapatan += stockBunga[1] * bungaKeladi;
        totPendapatan += stockBunga[2] * bungaAlocasia;
        totPendapatan += stockBunga[3] * bungaMawar;
            return totPendapatan;
    }
  
}