package linkedList;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}


class SLL{   // user define data structure 
    Node head = null; 
    Node tail = null;


    
    int size ;
    void addAtTail(int n){
        Node temp = new Node(n);
        if(head == null){
            head = temp ;
            tail = temp ;
        }
        else{
            // if(temp == null){
            //     tail = temp;
            // }
            tail.next = temp ;
            tail = temp;
            
        }
        size ++;
    }

    void addAtHead(int n){
        Node temp = new Node(n);
        if(head == null){
            head = temp ;
            tail = temp ;
        }
        else{
            // if(temp == null){
            //     tail = temp;
            // }
            temp.next = head;
            head = temp;
            
        }
        size ++;
    } 
    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println( );
    }

    void insert(int idx, int val){
        if(idx == 0) {
            addAtHead(val); 
            return;
        } 

        if(idx==size){
            addAtTail(val);
            return;
        }
        if(size<idx) {
            System.out.println("Invalid Index !!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;

        for(int i=1; i<=idx-1; i++){
            
            x = x.next;
        }
        // insertion part 
        temp.next = x.next;
        x.next =temp;
        size++;
    }

    // get value // 16-07-24
    int get(int idx) throws Error {
        if(idx == size-1) return tail.val;
        if(idx >=size || idx <0){
           throw new  Error("Invalid value ");
        }

        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    // set value at .....
    void set(int idx, int val) throws Error{
        if(idx ==size-1){
            tail.val = val;
            return;
        }
        if(idx >=size || idx < 0){
            throw new Error("Bhai error hai");
        }
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.val = val;
        // System.out.println(temp.val);
    }

    void deleteAtHead(){
        if(head == null) throw new Error("Empty list ");
        head = head.next;
        size--;
    }

    void deleteAt(int idx){
        if(idx==0){
            deleteAtHead();  
            return;
        }
        if(idx < 0 || idx >=size)  System.out.println("Invalid ");
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        if(temp.next == tail){
            tail=temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    // size 
    void size(){
        System.out.println("Length of Linked lsit is : "+size);
    }

}
public class InsertAtIndex {
    public static void main(String[] args) {
        SLL list = new SLL();
        System.out.println(list.size);
        list.size();
        list.addAtTail(10);
        list.addAtTail(49);
        list.addAtTail(9);
        list.addAtTail(94);
        list.addAtTail(98);

        System.out.println("Print all Linked list ");
        list.size();
        list.display();
        System.out.println(list.size);

        //
        list.addAtTail(596);
        list.display();
        System.out.println(list.size);
        list.size();

        list.addAtHead(60);
        list.display();
        System.out.println(list.head.val);

        list.insert(3, 90);
        list.display();
        list.insert(10, 59);
        list.display();
        list.size();
        list.insert(0, 59);
        list.display();


    // get value // 16-07-24
    System.out.println(list.get(3));
    // System.out.println(list.get(-1));

    list.get(5);
    System.out.println(list.get(4));
    list.display();
    System.out.println("k");


    list.deleteAtHead();
    list.display();
    list.size();

    list.deleteAt(3);
    list.display();
    System.out.println(list.tail.val);
    list.set(2, 900);
    list.display();
    }
}
