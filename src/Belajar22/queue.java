package Belajar22;

public class queue {
    int[] data;
    int head, tail, size, max;

    public queue(int n) {
        data = new int[n];
        max = n;
        head = tail = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            System.out.println("Data Terdepan : " + data[head]);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            int i = head;
            do {
                System.out.println(data[i] + " ");
                i = i + 1 % max;
            } while (i != tail) ;
            System.out.println(data[i]);
            System.out.println("jumlah elemen "+ size);
        }
    }
    public void clear(){
        if(!isEmpty()){
            head = tail = -1;
            size =0;
            System.out.println("berhasil dikosongkan");
        }
        System.out.println("queue kosong");
    }
public void enqueue(int dt){
    if(!isEmpty()){
        head = tail = 0;
    }else{
        if (head == max -1){
            tail = 0;
        }else{
            tail++;
        }
    }
    data[tail] = dt;
    size++;
}
public void Dequeue(){
    int dt;
    if(!isEmpty()){
        head = tail= 0;
    }else{
       dt = data[head];
        size--;
    }if(head == max -1){
            head = 0;
    }else{
        head++;
    }
}
}