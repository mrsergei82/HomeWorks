package lesson6;

public class Dog extends Animal{
    Dog(String name) {
        super(name);

    }
    @Override
    void run(int m){
        if (m>500){
            m=500;
        }
        System.out.println(name+" бежит "+m+" m");
    }
    void swim(int s){
        if (s>10){
            s=10;
        }
        System.out.println(name+" проплыл "+s+" m");
    }
}
