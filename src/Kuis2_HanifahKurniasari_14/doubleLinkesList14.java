package Kuis2_HanifahKurniasari_14;

public class doubleLinkesList14 {
    node14 head;
    int size;
public void doubleLinkedList14() {
        head = null;
        size = 0;
    }
public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new node14(null, item, null);
        } else {
            node14 newNode = new node14(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node14 current = head;
            while ((current.next != null)) {
                current = current.next;
            }
            node14 newNode = new node14(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void print() {
        if (!isEmpty()) {
            node14 tmp = head;
            while ((tmp != null)) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("linked list kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("linked list masih kosong, tidak dapat dihapus");
        }
         else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

}