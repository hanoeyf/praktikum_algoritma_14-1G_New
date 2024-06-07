package jobsheet12;

public class node14 {
     int data;
     node14 prev, next;
     int jarak;

     node14(node14 prev, int data, int jarak, node14 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak= jarak;
     }
}
