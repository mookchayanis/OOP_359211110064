package ooplab9;

public class myPerson {
    public static void main (String[]args){
        Person person = new Person("mook","23",
                new Address("191/6","susattani",
        "84190"),
                new Job("Administration","9000"));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary("15000");
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());

    }

}//class
