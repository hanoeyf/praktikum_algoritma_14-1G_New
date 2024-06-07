package jobsheet12;

import java.util.Scanner;

public class graphMain14 {
    public static void main(String[] args) throws Exception {
        graphMatriks14 gdg = new graphMatriks14(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();   
        for (int i = 0; i < 4; i++) {
            System.out.println("gedung "+(char)('A'+ i)+ ":");
            System.out.println("indegree: "+gdg.inDegree(i));
            System.out.println("outdegree: "+ gdg.outDegree(i));
        }

        graph14 gedung = new graph14(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge (1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge (1, 3);
        gedung.printGraph();

        Scanner sc14 = new Scanner(System.in);
        int asal, tujuan;
        System.out.print("Masukkan inputan: ");
        int input = sc14.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan gedung asal: ");
            asal = sc14.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            tujuan = sc14.nextInt();
            if (gedung.ifTrue(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetanga");
            } else {
                System.out.println(
                        "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
            System.out.println();
        }
        sc14.close();
        
    }
    
}