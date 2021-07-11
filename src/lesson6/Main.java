package lesson6;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Murka");
        Animal dog = new Dog("Bobik");
        Animal cat1 = new Cat("Barsik");

        cat.run(450);
        dog.run(600);
        cat.swim(5);
        dog.swim(15);
        cat1.run(300);
        System.out.println("Создано "+Cat.countCat+" котов");
        System.out.println("Создано "+Dog.countDog+" собак");
        System.out.println("И всего "+Animal.animalCount+" животных");
    }






}
