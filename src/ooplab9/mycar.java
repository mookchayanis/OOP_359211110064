package ooplab9;

public class mycar {
    public static void main(String[] args) {
        Engine engine = new Engine("1500cc","V-TEC V4");
        car car = new car("Honda","Rad",engine);
        System.out.println(car.toString());
    }
}//class
