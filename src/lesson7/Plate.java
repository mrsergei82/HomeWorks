package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food>=appetite){
            food -= appetite;
        }else food = food;

    }
    public int getFood(){ return food;}

    public void showInfo() {
        System.out.println("plate: " + food);
    }
   // public void addFood(){
     //   if (){
       //     food = food+40;
       // }
    //}
}
