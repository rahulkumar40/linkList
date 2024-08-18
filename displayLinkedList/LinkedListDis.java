package displayLinkedList;

class Nodes{
    int val ;
    Nodes next ;
    Nodes(int val){
        this.val = val;
    }
}


public class LinkedListDis {

    public static void rePrint(Nodes s ){
        Nodes temp = s; 
        if(temp==null) return;
        System.out.println(temp.val);
        rePrint(s.next);
    }

    public static void print(Nodes n){

        Nodes temp = n;
        while (temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        
        Nodes a = new Nodes(10);
        Nodes b = new Nodes(20);
        Nodes c = new Nodes(30);
        Nodes d = new Nodes(40);
        Nodes e = new Nodes(50);

        a.next = b;   // 10 -> 20       :: a -> b
        b.next = c;    // 20 -> 30      :: a -> b
        c.next = d;     // 30 -> 40     :: a -> b
        d.next = e;     // 40 -> 50     :: a -> e

        Nodes temp = a;
        System.out.println(temp.val);
         
        temp = temp.next;
        System.out.println(temp);


        // with the help of size of linked list 
        for(int i=0; i<4; i++){
            System.out.println(temp.val);
            temp = temp.next;
        }


        // with the help of last value null: : for infinite value 
        System.out.println( );
        temp = a;
        while (temp !=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        System.out.println("With Method ");
        print(a);

        System.out.println("With the help of Recursion ");
        rePrint(a);

        
    }
}
