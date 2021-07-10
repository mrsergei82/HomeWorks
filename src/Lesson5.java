public class Lesson5 {
    public static void main(String[] args){
        Employee[] employees = new Employee[5];
        employees[0]= new Employee("Ivan","povar","i@van","003",30000,30);
        employees[1]= new Employee("Vova","slesar","v@ova","004",40000,45);
        employees[2]= new Employee("Katia","sekretar","k@tia","005",25000,20);
        employees[3]= new Employee("Dima","security","d@ima","007",50000,38);
        employees[4]= new Employee("Nikolai","direktor","ni@ko","008",1000,50);

        for (int i=0;i< employees.length;i++){
            if (employees[i].age>=40){
                employees[i].print();
            }

        }
    }




}

