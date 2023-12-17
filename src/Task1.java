import java.util.Scanner;
import java.util.regex.Pattern;




public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (String word : words) {
            if (word.length() >= 2 && word.length() <= 6 && Pattern.matches("^[\\p{Lu}]+$", word)) {
                System.out.println( " Аббревиатура: " + word);
            }
        }
    }
}