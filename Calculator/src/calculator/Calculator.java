package calculator;
import java.util.ArrayList;

public class Calculator implements java.io.Serializable, Calculations {
//	private double OperandOne;
//	private double OperandTwo;
	private String Operation;
	private double result;
	private String tempInfo = "";
	private ArrayList<String> results = new ArrayList<String>();
	
	public Calculator(){
//		this.OperandOne = 0;
//		this.OperandTwo = 0;
		this.Operation = "";
		this.result = 0;
	}
	
//	public void setOperandOne(double one) {
//		this.OperandOne = one;
//		System.out.println("Your set your first Operand value to: " + this.OperandOne);
//	}
//	
//	public void setOperandTwo(double two) {
//		this.OperandTwo = two;
//		System.out.println("Your set your second Operand value to: " + this.OperandTwo);
//	}
	
//	public void setOperation(char sign) {
//		this.Operation = sign;
//	}
	
	
	@Override
	public void performOperation(String sign) {
		if(sign.equals("=")) {
			this.tempInfo += " = " + this.result;
			this.results.add(this.tempInfo);
			this.Operation = "";
		}else {
			this.Operation = sign;
		}
	}
	
	@Override
	public void performOperation(double number) {
		if(this.Operation.isEmpty()) {
			this.result = number;
			this.tempInfo += result;
		}
		if(this.Operation.equals("+")) {
			this.result += number;
			this.tempInfo += " + " + number;
			
		}else if(this.Operation.equals("-")) {
			this.result -= number;
			this.tempInfo += " - " + number;
			
		} else if(this.Operation.equals("*")) {
			this.result *= number;
			this.tempInfo += " * " + number;
			
		}else if(this.Operation.equals("/")) {
			this.result = this.result / number;
			this.tempInfo += " / " + number;
		}
	}
	
	
	@Override
	public void getResults() {
		for(int i = 0; i < this.results.size(); i++) {
			System.out.println(this.results.get(i));
		}
	}
	
	
	
	
	
	
}
