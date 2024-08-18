package Introduction;

;class Nodes{
    int val ;
    String next;
    Nodes(int val){
        this.val=val;
    }
}
public class ThirdLectShallowCopy {
    public static void main(String[] args) {
        Nodes a = new Nodes(10);

        System.out.println(a.val);
        System.out.println( );
        Nodes temp = a;
        System.out.println(a);
        System.out.println(temp);

    }
}
