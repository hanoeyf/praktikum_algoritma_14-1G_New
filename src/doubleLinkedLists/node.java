package doubleLinkedLists;

public class node {
    int data;
    node prev, next;

    node(node prev, int data, node next){
        this.data = data;
        this.next=next;
        this.prev=prev;
        
    }
}
