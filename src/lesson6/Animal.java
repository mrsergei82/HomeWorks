package lesson6;

import sun.awt.geom.AreaOp;

public abstract class Animal {
    String name;
    public static int countCat = 0;
    public static int countDog =0;
    public static int animalCount = 0;

    Animal(String name){
        this.name=name;
        animalCount++;
    }
     void run(int m){
        System.out.println(name+" Бежит "+m+" m");
     }
     abstract void swim(int s);

}
