import java.util.Arrays;
import java.util.List;

public class RomanExample extends Example {
    String[] lessTen = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] greatTen = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
    List<String> lessTenList = Arrays.asList(lessTen);

    public RomanExample(String firstNumber, String arithmeticSigh, String secondNumber) {
        super(firstNumber, arithmeticSigh, secondNumber);
    }

    public String convertArabicToRoman(int x) {
        return greatTen[x / 10] + lessTen[x % 10];
    }

    public String getDecision() {
        _firstNumber = lessTenList.indexOf(firstNumber);
        _secondNumber = lessTenList.indexOf(secondNumber);
        int arabicNumber = Integer.parseInt(super.getDecision());
        return convertArabicToRoman(arabicNumber);
    }
}
