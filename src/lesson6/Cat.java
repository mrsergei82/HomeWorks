package lesson6;

public class Cat extends Animal{

    Cat(String name) {
        super(name);
        countCat++;
    }
    @Override
    void run(int m){
        if (m>200){
            m=200;
            System.out.println(name+" бежит "+m+" m");
        }
    }
    void swim(int s){
        System.out.println(name+" Не умеет плавать");
    }
}
