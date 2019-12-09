package ObjectStructure;

import java.util.Random;

public class Exercises {
	private static final short OPERATION_NUMBER = 50;
	private static final short COLUMN_NUMBER = 5;
	private static Equation operationList[] = new Equation[OPERATION_NUMBER];

	public static void generateExercises() {
		Equation anOperation;
		Equation opCreator = new Equation();
		for (int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateEqOperation();
			while (contains(anOperation, i - 1)) {
				anOperation = opCreator.generateEqOperation();
			}
			operationList[i] = anOperation;
		}
	}
	private static boolean contains(Equation anOperation,int length) {
		boolean found = false;
		for (int i = 0; i < length; i++) {
			if (anOperation.equals(operationList[i])) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	static void fromateAndDisplay() {
		int i=1;
		generateExercises();
		for (Equation equation : operationList) {
			System.out.print(equation.asString()+"\t");
			if (i%COLUMN_NUMBER==0) {
				System.out.println();
			}
			i++;
		}
	}
	public static void main(String[] args) {
		fromateAndDisplay();
	}
}
