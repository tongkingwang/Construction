package ObjectStructure2;

import java.util.Random;

abstract class BinaryOperation {
	protected static final int UPPER=100;
	protected static final int LOWER=0;
	private int leftNum=0;
	private int rightNum=0;
	private int interAnwer=0;
	private char oper='+';
	
	public int getLeftNum() {
		return leftNum;
	}
	public int getRightNum() {
		return rightNum;
	}
	public char getOper() {
		return oper;
	}
	public void getInterAnwer(int interAnwer) {
		this.interAnwer = interAnwer;
	}
	public String toString() {
		return leftNum + ""+ oper +   rightNum ;
	}
	public String asString() {
		return   leftNum + ""+ oper +   rightNum + "=" ;
	}
	public String fullString() {
		return leftNum + ""+ oper +   rightNum + "=" +interAnwer;
	}
	
	protected void generateEqOperation(char anOperator) {
		int left,right,result;
		Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		} while (!(checkingCalculation(result)));
		leftNum = left;
		rightNum = right;
		oper = anOperator;
		interAnwer = result;
	}
	
	abstract boolean checkingCalculation(int anInteger);
	abstract int calculate(int left,int right);
	
	public boolean equals(BinaryOperation anoperation) {
		return leftNum == anoperation.getLeftNum() & rightNum ==anoperation.getRightNum() & oper == anoperation.getOper();
	}
}
