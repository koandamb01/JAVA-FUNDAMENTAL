package calculator;
import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
	private double OperandOne;
	private double OperandTwo;
	private char Operation;
	private double result;
	private ArrayList<String> results = new ArrayList<String>();
	
	public Calculator(){
		this.OperandOne = 0;
		this.OperandTwo = 0;
		this.result = 0;
	}
	
	public void setOperandOne(double one) {
		this.OperandOne = one;
		System.out.println("Your set your first Operand value to: " + this.OperandOne);
	}
	
	public void setOperandTwo(double two) {
		this.OperandTwo = two;
		System.out.println("Your set your second Operand value to: " + this.OperandTwo);
	}
	
	public void setOperation(char sign) {
		this.Operation = sign;
	}
	
	public void performOperation() {
		if(this.OperandOne == 0 || this.OperandTwo == 0) {
			System.out.println("Please set your Operands!!!!");
		}else {
			if(this.Operation == '+') {
				this.result = this.OperandOne + this.OperandTwo;
				this.results.add(this.OperandOne + " + " + this.OperandTwo + " = " + this.result);
				this.OperandOne = this.OperandTwo = 0;
			}
			else if(this.Operation == '-') {
				this.result = this.OperandOne - this.OperandTwo;
				this.results.add(this.OperandOne + " - " + this.OperandTwo + " = " + this.result);
				this.OperandOne = this.OperandTwo = 0;
			}
			else {
				System.out.println("Please choose a correct operation, Hint: + or -");
			}
		}
	}
	
	public void getResults() {
		for(int i = 0; i < this.results.size(); i++) {
			System.out.println(this.results.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
}
