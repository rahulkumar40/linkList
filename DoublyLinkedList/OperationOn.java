package DoublyLinkedList;

class Node{
    int val;
    Node next ;
    Node pre;
    Node(int val){
        this.val = val;
    }
}
class DoublyLL{
    static Node head ;
    Node tail;
    int size = 0;
    // add value at tail of the doubly linked list.
    void attAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            tail = temp;
            head = temp;
        }
        else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size ++;
    }
    // add value at head of the doubly linked list.
    void addAtHead(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.pre = temp;
            head = temp;
        }
        size++;
    }
    void addAtIdx(int idx, int val){
        if(idx==0){
            addAtHead(val);
            return ;
        }
        if(size-1 == idx){
            attAtEnd(val);
            return ;
        }
        if(idx<0 && idx >= size){
            System.out.println("Invalid index :: ");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<idx; i++){
            x = x.next;
        }
        Node t = x.next;
        temp.next = x.next;
        x.next = temp;
        t.pre = temp;
        temp.pre = x;
        size++;
    }
    void addAtIdxBySir(int idx, int val){
        if(idx==0){
            addAtHead(val);
            return ;
        }
        if(size-1 == idx){
            attAtEnd(val);
            return ;
        }
        if(idx<0 && idx >= size){
            System.out.println("Invalid index :: ");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<idx; i++){
            x = x.next;
        }
        Node y = x.next;
        x.next = temp;
        temp.pre = x;
        y.pre = temp;
        temp.next = y;
        size++;
    }
    void deleteHead(){
        // Node temp = head;
        head = head.next;
        head.pre = null;
        // head.next.pre = head; not require 
        size--;
    }
    void deleteTail(){
        // Node temp = head;
        tail = tail.pre;
        tail.next = null;
        // head.next.pre = head; not require 
        size--;
    }
    void deletAtIdx(int idx){
        Node temp = head;
        if(idx == 0){
            deleteHead();
            return ;
        }
        if(idx == size-1){
            deleteTail();
            return ;
        }
        if(idx < 0 && idx >=size ){
            System.out.println("invalid index :: ");
            return;
        }
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.pre = temp.pre.pre;
        size --;

    }
    // display all value of doubly linked list.
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size :: "+size);
    }
    public static void reverse(Node list){
        Node curr = head;
        Node pre = null;
        Node nex = head;
        while(curr!=null){
            
        }
    }
}
public class OperationOn {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.size();
        list.display();
        list.attAtEnd(10);
        list.attAtEnd(20);
        list.attAtEnd(30);
        list.attAtEnd(40);
        list.size();
        list.display();
        list.addAtHead(58);
        list.size();
        list.display();
        list.addAtIdx(3, 500);
        list.addAtIdx(4, 8495);
        list.size();
        list.display();
        list.addAtIdxBySir(2, 50948);
        list.size();
        list.display();
        list.deleteHead();
        list.size();
        list.display();
        list.addAtIdx(5, 59);
        list.deleteTail();
        list.size();
        list.display();
        list.deletAtIdx(3);
        list.size();
        list.display();
    }
}
