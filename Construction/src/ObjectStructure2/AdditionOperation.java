package ObjectStructure2;
class AdditionOperation extends BinaryOperation{
	
		AdditionOperation(){
			generateEqOperation('+');
		}
		@Override
		boolean checkingCalculation(int anInteger) {
			return anInteger <= UPPER;
		}
		@Override
		int calculate(int left, int right) {
			return left + right;
		}
}