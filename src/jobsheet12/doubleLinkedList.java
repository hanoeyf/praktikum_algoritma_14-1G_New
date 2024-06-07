package jobsheet12;
public class doubleLinkedList {
    node14 head;
    int size;
    public doubleLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new node14(null, item, jarak, null);
        } else {
            node14 newNode = new node14(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        node14 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    public void remove(int index) {
        node14 current = head;
            while (current != null) {
             if (current.data == index) {
                 if (current.prev != null) {
                    current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            size--;
            break;
        }
        current = current.next;
    }
    }
    public int get(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("nilai indeks diluar batas");
        }
        node14 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp =tmp.next;
        }
        return tmp.data;
    }

    public int size() {
       return size;
    }
    public void clear(){
        head=null;
        size=0;
    }

}
