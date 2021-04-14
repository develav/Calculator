public abstract class Example {
     private int decision;
     String firstNumber;
     String arithmeticSigh;
     String secondNumber;
     int _firstNumber;
     int _secondNumber;
    public Example(String firstNumber, String arithmeticSigh, String secondNumber){
        this.firstNumber = firstNumber;
        this.arithmeticSigh = arithmeticSigh;
        this.secondNumber = secondNumber;
    }

    public String getDecision(){
        switch(arithmeticSigh){
            case "+":
                decision = _firstNumber + _secondNumber;
                break;
            case "-":
                decision = _firstNumber - _secondNumber;
                if(decision <= 0){
                    throw new ArithmeticException("Отрицательное число или ноль");
                }
                break;
            case "*":
                decision = _firstNumber * _secondNumber;
                break;
            case "/":
                decision = _firstNumber / _secondNumber;
                break;
        }
        return decision + "";
    }
}
