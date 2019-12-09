package ObjectStructure2;

import java.util.Random;
public class Exercise {
	
	public void generateBinaryExercise(int operation) {
		BinaryOperation anOperation;
		while (operation>0) {
			do {
				anOperation = generateOperation();
			} while (contains(anOperation, operation));
			operation--;
		}
	}
	
	@SuppressWarnings("null")
	private boolean contains(BinaryOperation anOperation,int length) {
		boolean found = false;
		for (int i = 0; i < length; i++) {
			BinaryOperation[] operationList = null;
			if (anOperation.equals(operationList[i])) {
				found = true;
				break;
			}
		}
		return found;
	}

	private BinaryOperation generateOperation() {
		Random random = new Random();
		if (random.nextInt(2)==1) {
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	
	public static void generateAddition(int operation, int cal) {
		for (int i = 1; i <=operation; i++) {
			AdditionOperation additionOperation = new AdditionOperation();
			System.out.print(additionOperation.asString()+"\t");
			if (i%cal==0) {
				System.out.println();
				}
			}
			
		}

	public static void generateSubstract(int operation,int cal) {
		for (int i = 1; i <=operation; i++) {
			SubstractOperation substractOperation =  new SubstractOperation();
			System.out.print(substractOperation.asString()+"\t");
			if (i%cal==0) {
				System.out.println();
			}
		}
		
	}	
	public static void main(String[] args) {
		generateAddition(30,5);
		generateSubstract(20,5);
	}
}
