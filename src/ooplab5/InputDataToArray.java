package ooplab5;

import java.util.Scanner;

public class InputDataToArray {
    private static int MAX = 5;
    public static void main (String[] args){
        int number[] = new int[MAX];
        System.out.println(number.length);
        //for
        number = inputData (number);
        showData(number);
        showDataEnchance(number);


}//main

    private static void showDataEnchance(int[] number) {
        System.out.println("Data in Array: ");
        for (int val:number)
            System.out.println(val+" ");
    }


    private static void showData(int[] number) {
        System.out.println("Data in Array: " );
        for (int i=0;i<number.length;i++)
        System.out.println(number[i]+" ");
    }


            private static int[] inputData(int[]number){
        Scanner Scsnner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for (int i=0;i<number.length;i++){
            System.out.println("numbee["+i+"]:");
            number[i] = Scsnner.nextInt();

        }
        return number;
    }//inputData

}//class