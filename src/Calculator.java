import java.util.Scanner;

public class Calculator {

    public static boolean isArabicExample(String firstNumber, String arithmeticSigh, String secondNumber){
        return firstNumber.matches("[1-9]|10") &&
                arithmeticSigh.matches("[+]|[-]|[*]|[/]") &&
                secondNumber.matches("[1-9]|10");
    }

    public static boolean isRomanExample(String firstNumber, String arithmeticSigh, String secondNumber){
        return firstNumber.matches("X|IX|IV|V?I{0,3}") &&
                arithmeticSigh.matches("[+]|[-]|[*]|[/]") &&
                secondNumber.matches("X|IX|IV|V?I{0,3}");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstNumber = in.next();
        String arithmeticSigh = in.next();
        String secondNumber = in.next();
        in.close();

        Example example;

        if (isArabicExample(firstNumber, arithmeticSigh, secondNumber)) {
            example = new ArabicExample(firstNumber, arithmeticSigh, secondNumber);
        } else if (isRomanExample(firstNumber, arithmeticSigh, secondNumber)) {
            example = new RomanExample(firstNumber, arithmeticSigh, secondNumber);
        } else {
            throw new IllegalArgumentException("Некорректные данные!");
        }
        System.out.println(example.getDecision());
    }
}
