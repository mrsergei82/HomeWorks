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
        int[] ints2 = new int[100];
        for (int i = 0; i < ints2.length; i++){
            ints2[i] = i+1;
            System.out.println(ints2[i]);
        }
        int[] ints3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        int[] ints31 = new int[12];
        for (int i = 0; i < ints3.length; i++){
            if (ints3[i] < 6){
                ints31[i] = ints3[i]*2;
            }
            else ints31[i] = ints3[i];
            System.out.println(ints31[i]);
        }
        int[][] ints4 = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j){
                    ints4[i][j] = 1;
                    System.out.println(ints4[i][j]);
                }
            }
        }
        for (int i = 4; i>0; i-- ){
            for (int j = 4; j>0; j--){
                if (i == j){
                    ints4[i][j] = 1;
                    System.out.println(ints4[i][j]);
                }
            }
        }
    }

}
