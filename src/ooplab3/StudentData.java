package ooplab3;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 // เขียนโปรแกรมเพื่อรับค่าข้อมูลของนักศึกษาคนหนึ่งโดยมีข้อมูลต่อไปนี้
//1.ชื่อ-สกุล
//2.รหัสนักศึกษา
//3.สาขาที่เรียน และคณะ
//4.ที่อยู่
//5.email
//หมายเหตุ: ต้องรับค้าข้อมูลแต่ละข้อมูลโดยการใช้ Methods
public class StudentData {

    public static void main(String[] arge){
        getName();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("wath is your name? :");
         String name = reader.readLine();
         System.out.print("Your name is"+name);

        }
    }//main


    private static void getName() {
    }


}//calss
