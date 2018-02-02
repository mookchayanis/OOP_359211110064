package ooplab8;

public class PersonApp {
    public static void main (String[]arge){
        //create object as student
        Student student = new Student("1111111111111","Boy saiyai","109 M.2 Thungsong",
                "Male","STD0001","Information System");
        System.out.println(student.toString());
        student.setName("Boy saiyong");
        System.out.println(student.toString());


        //create object as student
        Employee Employee = new Employee("359211110064","chayanis","191/6 M.5 Bansong",
                "lady", "Student","9000","M&M");
        System.out.println(Employee.toString());



}//main
}//class
