package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eatFrom(Plate plate) {
        if (plate.getFood()>=appetite){
            plate.decreaseFood(appetite);
            satiety = true;
        }else {
            satiety = false;
        }
        isSatiety(satiety);
    }
    public void isSatiety(boolean satiety){
        if (satiety){
            System.out.println("Кот "+name+" поел");
        }else System.out.println("Кот "+name+" не поел");
    }
    public int getAppetite(){ return appetite;}
    public boolean getSatiaty(){ return satiety;}

}
