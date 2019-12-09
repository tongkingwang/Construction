package ObjectStructure2;
class SubstractOperation extends BinaryOperation{
	
		SubstractOperation(){
			generateEqOperation('-');
		}
		@Override
		boolean checkingCalculation(int anInteger) {
			return anInteger >= LOWER;
		}
		@Override
		int calculate(int left, int right) {
			return left - right;
		}
		
}