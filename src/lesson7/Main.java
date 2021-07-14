package lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
         cats[0] = new Cat("Барсик", 15, false);
         cats[1] = new Cat("Мурка", 6, false);
         cats[2] = new Cat("Пушок",7, false);
        Plate plate = new Plate(30);

        for (int i=0;i<cats.length;i++) {

            plate.showInfo();
            cats[i].eatFrom(plate);
        }
        plate.showInfo();


    }
}
