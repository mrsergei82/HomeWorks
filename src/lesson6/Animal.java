package lesson6;

import sun.awt.geom.AreaOp;

public abstract class Animal {
    String name;

    Animal(String name){
        this.name=name;
    }
     void run(int m){
        System.out.println(name+" Бежит "+m+" m");
     }
     abstract void swim(int s);

}
