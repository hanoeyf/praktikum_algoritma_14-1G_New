package minggu11;

public class SLLMain {
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        singLL.print();
        singLL.addFirst(890 );
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700,999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("ata pada indeks ke-1 "+singLL.getData(1));
        System.out.println("data 760 berada ada indeks ke-"+ singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();

        }
}
