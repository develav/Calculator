public class ArabicExample extends Example{

    public ArabicExample(String firstNumber, String arithmeticSigh, String secondNumber) {
        super(firstNumber, arithmeticSigh, secondNumber);
        _firstNumber = Integer.parseInt(firstNumber);
        _secondNumber = Integer.parseInt(secondNumber);
    }

    public String getDecision() {
        return super.getDecision();
    }
}
