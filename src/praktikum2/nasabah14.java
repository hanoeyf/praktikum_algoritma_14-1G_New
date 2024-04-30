package praktikum2;

public class nasabah14 {
    String norek, nama, alamat;
    int umur;
    double saldo;

    nasabah14(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }    
    nasabah14[] data;
    int front, rear, size, max;

    public nasabah14(int n){
        max =n;
        data=new nasabah14[max];
        for (int i = 0; i < max; i++) {
            data[i] = new nasabah14(); 
        }
        size=0;
        front=rear=-1;
    }
    nasabah14(){
        
    }
    
    public void enqueue(nasabah14 dt){
        if(isFull()){
            System.out.println("queue sudah penuh");
        } else {
            if (isEmpty()) {
                front =rear= 0;
                } else{
                   if (rear==max-1){
                    rear=0;
                }  else{
                       rear++;
                }
            }
            data[rear] =dt;
            size++;
        }     }
    public nasabah14 Dequeue(){
        nasabah14 dt = new nasabah14();
        if (isEmpty()){
            System.out.println("queue masih kosong") ;
        } else {
            dt = data[front];
            size--;
            if(isEmpty()){
                front=rear=-1;
            }else{
                if (front== max -1){
                    front=0;
                }else{
                    front++;
                }
            }
    } 
    return dt;
}
public boolean isEmpty(){
    if(size == 0){
        return true;
    }else{
        return false;
    }
}
public boolean isFull(){
    if (size == max){
        return true;
    }else{
        return false;
    }
}
public void peek(){
    if (!isEmpty()){
        System.out.println("elemen terdepan: "+data[front].norek+ " "+ data[front].nama+ " "
        +data[front].alamat+ " " + data[front].umur+" " + data[front].saldo);
    }else{
        System.out.println("queue masih kosong");
    }
}
public void print() {
    if (isEmpty()) {
        System.out.println("queue masih kosong");
    } else {
        int i = front;
        do {
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            i = (i + 1) % max;
        } while (i != (rear + 1) % max);
        System.out.println(" jumlah elemen= " + size);
    }
}
// public nasabah14 peekRear() { 
//     if (!isEmpty()){
//         System.out.println("elemen paling belakang: "+data[rear].norek+ " "+ data[rear].nama+ " "
//         +data[rear].alamat+ " " + data[rear].umur+" " + data[rear].saldo);
//     }else{
//         System.out.println("queue masih kosong");
//     }
//     return null;
// }
}