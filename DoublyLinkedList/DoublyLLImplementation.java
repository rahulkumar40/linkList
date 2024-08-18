package DoublyLinkedList;
class DNode{
    int val ;
    DNode next ;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}
class DLL {
    DNode head;
    DNode  tail;
    int size = 0;
    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    void display(){
        DNode temp = head;
        while (temp!=null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println( );
    }
}

public class DoublyLLImplementation {
    static void printWithStart(DNode head){
        int size = 0;
        DNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            size ++;
        }

        System.out.println( );
        System.out.println("Size :: "+size);
    }
    static void printWithTail(DNode tail){
        DNode temp = tail;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }
    static void printWithAnyNodeToAll(DNode node){

        DNode temp = node;
        while (temp.prev!=null) {
            temp = temp.prev;
        }
        DNode head = temp;
        printWithStart(head);
        
    }
    public static void main(String[] args) {
        DNode a = new DNode(5);
        DNode b  = new DNode(6);
        DNode c= new DNode(6);
        DNode d = new DNode(15);
        DNode e = new DNode(51);
        DNode f= new DNode(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        a.prev = null;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        f.prev = e;


        // System.out.println( );
        // while(f!=null){
        //     System.out.print(f.val + " ");
        //     f = f.prev;
        // }

        printWithStart(a);
        printWithTail(f);

        System.out.println();
        System.out.println("Print d = 15 ");
        printWithAnyNodeToAll(d);

        DLL list = new DLL();
        list.display();
        list.insertAtTail(56);
        list.insertAtTail(564);
        list.insertAtTail(456);
        list.display();
        
    }
}
