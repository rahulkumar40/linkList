package basicLinkedList;

public class OppsStudent {
    public static class Studnet{
        String name ;
        int roll_No;
        double percent;
    }
    public static void main(String[] args) {
        Studnet x = new Studnet();
        x.name = "Rahul";
        x.roll_No = 54;
        x.percent = 56.7;

        System.out.println(x.name);
        System.out.println(x.roll_No);

        Studnet s= new Studnet();
        s.name = "Akshit";
        s.percent = 98.6;
        s.roll_No = 95;
    }
}
