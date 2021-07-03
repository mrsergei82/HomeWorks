public class Lesson3 {
    public static void main(String[] args) {
        int[] ints = {1,1,0,0,1,0,1,1,0,1};
        int[] ints1 = new int[10];
        for (int i = 0; i<ints.length; i++){
            if (ints[i] == 0){
                ints1[i] = 1;
            }
            else ints1[i] = 0;
            System.out.println(ints1[i]);
        }
    }

}
