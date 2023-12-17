import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        for (String word : words) {
            if (word.length() >= 2 && word.length() <= 6) {
                Matcher m = Pattern.compile("[\\p{Lu}]+").matcher(word);
                if (m.find()) {
                    System.out.println( " Аббревиатура: " + m.group());
                }
            }
        }
    }
}

