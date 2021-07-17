package lesson8_1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<words.length; i++){
            System.out.println("Угадайте слово");
            while (true) {
                String answer = scanner.nextLine();
                char[] str = new char[15];
                for (int j = 0; j < words[i].length(); j++) {
                    if (answer.charAt(j) == words[i].charAt(j)) {
                        str[j] = words[i].charAt(j);
                    } else str[j] = 35;
                }
                System.out.println(str);
                if (answer.equals(words[i])) {
                    break;
                }
            }
        }
    }
}