public class Lesson5 {
    public static void main(String[] args){
        Person[] persons = new Person[5];
        persons[0]= new Person("Ivan","povar","i@van","003",30000,30);
        persons[1]= new Person("Vova","slesar","v@ova","004",40000,45);
        persons[2]= new Person("Katia","sekretar","k@tia","005",25000,20);
        persons[3]= new Person("Dima","security","d@ima","007",50000,38);
        persons[4]= new Person("Nikolai","direktor","ni@ko","008",1000,50);

        for (int i=0;i< persons.length;i++){
            if (persons[i].age>=40){
                persons[i].print();
            }

        }
    }

    public static class Person {
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public Person(String name,String position,String email,String phoneNumber,int salary,int age){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }
        public void print(){
            System.out.println(name+" "+position+" "+email+" "+phoneNumber+" "+salary+age);
        }

    }
}

