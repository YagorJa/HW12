import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольный текст:");
        String inputText = scanner.nextLine();

        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        String documentPattern = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phonePattern = "\\+\\(\\d{2}\\)\\d{7}";

        findAndPrintMatches(emailPattern, inputText, "Email");
        findAndPrintMatches(documentPattern, inputText, "Document Number");
        findAndPrintMatches(phonePattern, inputText, "Phone Number");
    }

    private static void findAndPrintMatches(String patternString, String text, String infoType) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(infoType + ": " + matcher.group());
        }
    }
}
