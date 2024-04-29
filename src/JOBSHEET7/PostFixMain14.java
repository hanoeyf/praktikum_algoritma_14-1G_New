package JOBSHEET7;

import java.util.Scanner;

public class PostFixMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        String P, Q;
        System.out.println("masukkan ekspresi matematika (infix): ");
        Q= sc14.nextLine();
        Q= Q.trim();
        Q= Q + ")"; 
        int total = Q.length();

        Postfix14 post = new Postfix14(total);
        P= post.konversi(Q);
        System.out.println("postfix: "+ P); 
    }
}
