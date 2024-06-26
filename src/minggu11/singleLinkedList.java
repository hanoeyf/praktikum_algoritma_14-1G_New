package minggu11;

public class singleLinkedList {
    node head, tail;
    boolean isEmpty() {
        return head == null;
    }
    void print() {
        if (isEmpty()) {
            System.out.println("linked list kosong");
        }
        node tmp = head;
        System.out.println("isi linked list");
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println();
    }
    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    void addLast(int input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter(int key, int input) {
        node ndInput = new node(input, null);
        node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key " + key + " tidak ditemukan dalam list!");
        }
    }
    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("perbaiki logikanya! kalau indeksnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi batas!");
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;

    }
    int indexOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("linked list masih kosong,"
                    + " tidak  dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    void removeLast() {
        if (isEmpty()) {
            System.out.println("linked list masih kosong,"
                    + " tidak  dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    void remove(int key) {
        if (isEmpty()) {
            System.out.println("linked list masih kosong,"
                    + " tidak  dapat dihapus");
        } else {
            node temp = head;
            while ((temp != null)) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }

        }
    }
    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null)
                tail = temp;
        }
    }
}
