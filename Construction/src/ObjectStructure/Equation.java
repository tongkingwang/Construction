package ObjectStructure;

import java.util.Random;

public class Equation {
	private static final int UPPER=100;
	private static final int LOWER=0;
	private int leftNum=0;
	private int rightNum=0;
	private char oper='+';
	private int interAnwer=0;
	
	public void construct(int left,int right,char op) {
		leftNum = left;
		rightNum =right;
		oper = op;
		if (op=='+') {
			interAnwer = left + right;
		} else {
			interAnwer = left - right;
		}
		
	}
	public Equation generateAdditionOperation() {
		Random random = new Random();
		int left,right,result;
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = left +right;
		} while (result>=UPPER);
		Equation eq = new Equation();
		eq.construct(left, right, '+');
		return eq;
	}
	
	public Equation generateSubstractOperation() {
		Random random = new Random();
		int left,right,result;
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = left - right;
		} while (result<=LOWER);
		Equation eq = new Equation();
		eq.construct(left, right, '-');
		return eq;
	}
	
	public Equation generateEqOperation() {
		Random random = new Random();
		int reust;
		reust = random.nextInt(LOWER+2);
		if (reust == 1 ) {
			return generateAdditionOperation();
		}else {
			return generateSubstractOperation();
		}
		
	}
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
	
	public boolean equals(Equation anoperation) {
		return leftNum == anoperation.getLeftNum() & rightNum ==anoperation.getRightNum() & oper == anoperation.getOper();
	}

	@Override
	public String toString() {
		return leftNum + ""+ oper +   rightNum ;
	}
	
	public String asString() {
		return   leftNum + ""+ oper +   rightNum + "=" ;
	}
	public String fullString() {
		return leftNum + ""+ oper +   rightNum + "=" +interAnwer;
	}
	
}
