package calculator;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		cal.setOperandOne(9);
		cal.setOperandTwo(10);
		cal.setOperation('+');
		cal.performOperation();
		
		cal.setOperandOne(11);
		cal.setOperandTwo(3);
		cal.setOperation('-');
		cal.performOperation();
		cal.getResults();
	}

}
