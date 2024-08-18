package implementation;


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
        // size ++;
    } 
    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println( );
    }

    // size 
    void size(){
        System.out.println("Length of Linked lsit is : "+size);
    }

}

public class ImplementLinkedList {

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
    }
}
