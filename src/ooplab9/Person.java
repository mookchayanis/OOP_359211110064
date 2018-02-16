package ooplab9;

public class Person {
    private String name;
    private String age;
    private Address Address;
    private Job Job;

    //construcotr
    public Person(String name, String age, ooplab9.Address address, ooplab9.Job job) {
        this.name = name;
        this.age = age;
        Address = address;
        Job = job;
    }
    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public ooplab9.Job getJob() {
        return Job;
    }

    public void setJob(ooplab9.Job job) {
        Job = job;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Address=" + Address +
                ", Job=" + Job +
                '}';
    }
}//class







