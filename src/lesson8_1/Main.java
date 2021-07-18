package lesson8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        String word ;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<words.length; i++){
            word = words[i];
            System.out.println("Угадайте слово");
            while (true) {
                String answer = scanner.nextLine();
                char[] str = new char[15];
                for (int j = 0; j < answer.length(); j++) {
                    if (answer.charAt(j) == word.charAt(j)) {
                        str[j] = word.charAt(j);
                    } else str[j] = 0;
                }
                System.out.println(str);
                if (answer.equals(word)) {
                    break;
                }
            }
        }
    }
}