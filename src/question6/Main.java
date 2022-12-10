package question6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 25 слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        int firstShownLetter = 0;
        int lastShownLetter = 1;
        boolean isDone = true;

        System.out.print("Words:");
        for (int i = 0; i < words.length; i++) {
            if (i % 8 == 0) System.out.print("\n");
            System.out.print(words[i] + " ");
        }
        int compChoiceWord = new Random().nextInt(24);
        //-------------------------------------------------------------------
        // временный вывод подсказки для проверки
        //-------------------------------------------------------------------
//        System.out.println("\nWord from comp is: " + words[compChoiceWord]);

        System.out.println("\nEnter your word: ");
        String userWord = sc.nextLine();
        boolean res = userWord.equals(words[compChoiceWord]);

        while (!res && lastShownLetter < words[compChoiceWord].length()) {
            isDone = false;
            System.out.println("wrong");

            for (int i = firstShownLetter; i <= lastShownLetter; i++) {
                System.out.print(words[compChoiceWord].charAt(i));
            }
            for (int i = 0; i <= (13 - lastShownLetter); i++) {
                System.out.print("#");
            }
            if (lastShownLetter == words[compChoiceWord].length()) {
                break;
            }

            System.out.println();
            if (lastShownLetter < (words[compChoiceWord].length() - 2)) {
                lastShownLetter += 2;
            } else {
                lastShownLetter++;
            }

            userWord = sc.nextLine();
            res = userWord.equals(words[compChoiceWord]);
            if (res) {
                isDone = true;
                break;
            }
        }
        if (!isDone) {
            System.out.println("To many attempts!");
            System.out.println("Right answer is:" + words[compChoiceWord]);
        }
        else System.out.println("Right answer!");
        sc.close();
    }
}
