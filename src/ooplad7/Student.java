package ooplad7;
//talking about student?
// 1.Student ID
// 2.Name
// 3.person ID
// 4.Address

public class Student {
    //properties of Student class
    private String id;
    private String name;
    private String pid;
    private String address;

    //constructor
    //default constructor
    public Student() {
    }

    //create by own
    public Student(String id, String n, String pid, String a) {
        //assign data to cless properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;
    }
    // getter and setter methods
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName (){
        return  this.name;
    }
    public void setName(String name){
        this.name
    }
    public String getPid (){
        return  this.pid;
    }
    public void setPid (String pid){
        this.pid
    }
    public String getAddress (){
        return  this.address;
    }
    public void setAddress(String address){
        this.address
    }




}//class
