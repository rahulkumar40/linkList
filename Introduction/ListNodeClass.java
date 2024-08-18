package Introduction;
/**
 * ListNodeClass
 */

class Nodes{
    int val;
    Nodes next;
    Nodes(int val){
        this.val=val;
    }
}

// class Car {
//     int price;
//     String name;
//     Car(int price, String name){
//         this.price = price;
//         this.name= name;
//     }
// }

// public static void allowNext(Nodes n, ){
    
// }
public class ListNodeClass {
    public static void main(String[] args) {
        // Car c1 = new Car( 120000, "k");
        // c1.name = "Kia Sonet";
        // c1.price = 122000;

        Nodes a = new Nodes(10);
        System.out.println( );
        System.out.println(a);
        System.out.println(a.val);
        Nodes b = new Nodes(20);
        System.out.println(b);

        // a.next = b;
        System.out.println(b);
        System.out.println( );
        // System.out.println(a.next);
        // System.out.println(b.next);
        Nodes c = new Nodes(30);
        Nodes d = new Nodes(40);
        Nodes e = new Nodes(50);

        a.next = b;   // 10 -> 20       :: a -> b
        b.next = c;    // 20 -> 30      :: a -> b
        c.next = d;     // 30 -> 40     :: a -> b
        d.next = e;     // 40 -> 50     :: a -> e

        System.out.println(a.val);  // 10 
        System.out.println(a.next.val); // 20
        System.out.println(a.next.next.val);  // 30
        System.out.println(a.next.next.next.val); // 40
        System.out.println(a.next.next.next.next.val); // 50
        // System.out.println(a.next.next.next.next.next.val);

    }
}
