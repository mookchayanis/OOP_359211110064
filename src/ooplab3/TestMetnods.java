package ooplab3;


public class TestMetnods {
    //global varintle
    private static int number=10;
    // Methods
    // type 1
    public static void  A(){
        System.out.println("Hello A");
    }//A
    //tybe 2
    public  static void B(int x,int y){
        System.out.println( "Hello B" +(x+y));
    }//B
    //tybe 3
    public static int C (int x, int y){
        System.out.println("Hello C");
        return x+y;
    }//C

    public static void main(String[] args){
        System.out.println("Hello Main");
        A();
        B(5,10);
       // manage return value
        int num = C(5,10);
        System.out.println(num);
        System.out.println(C(5,10));


    }//main
}//class
