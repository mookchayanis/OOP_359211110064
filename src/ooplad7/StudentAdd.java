package ooplad7;

import java.util.Scanner;

public class StudentAdd {
    public static void main (String[]args){
        //create object as Student
        Student s1 = new Student();
        s1.setId("0001");
        s1.setName("Boy saiyai");
        s1.setPid("111111111111");
        s1.setAddress("11/11 T.Thamyai A.Thungsong");

        System.out.println(s1.toString());

        Student s2 = new Student("0002",
                "Girl Saiyai",
                "2222222222222",
                "22/22 T.thawang A.Muang");
        System.out.println(s2.toString());

        Student s3 =new Student();
 //       s3 = inputData (s3);
  //      System.out.println(s3.toString());

        System.out.println(s2.getId());
        s2.setId("0004");
        System.out.println(s2.getId());
        s2.group = "IS223";
        System.out.println(s2.group);
        System.out.println(Student.age);
        Student.age =20;
        s2.age = 30;
        System.out.println(Student.age);
        System.out.println(s2.age);



    }//main

    private static Student inputData(Student s) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Insert your student inof: ");
        System.out.println("Student ID:");
        s.setId(Scanner.nextLine());
        System.out.println("Name:");
        s.setName(Scanner.nextLine());
        System.out.println("Person ID:");
        s.setPid(Scanner.nextLine());
        System.out.println("Adderss:");
        s.setAddress(Scanner.nextLine());
        return s;
    }//inputData
}//class
