package ooplab3;

public class OverLoadMetthod {
    public static void A(){
        System.out.println("Hello A");
    }
    public static void A(int x){
        System.out.println("Hello A"+x);
    }
    public static void A(int x,int y){
        System.out.println("Hello A"+(x+y));
    }
    private static void B(){
        System.out.println("Hello B");
        A();
    }

    public static void main (String[] args){
        A();
        A(10);
        A(10,20);
        B();


}//main
}//class
