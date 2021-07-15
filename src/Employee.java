public class Employee {
     String name;
     String position;
     String email;
     String phoneNumber;
     int salary;
     int age;

    public Employee(String name,String position,String email,String phoneNumber,int salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void print(){
        System.out.println(name+" "+position+" "+email+" "+phoneNumber+" "+salary+" "+age);}
}
