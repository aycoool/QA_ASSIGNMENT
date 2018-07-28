public class Divide extends OperationTypeState{
	private MathOperation mathOperation;
	@Override
	MathOperation.OperationType getOperationType() {
		return MathOperation.OperationType.DIVIDE;
	}
	
	@Override
	public int GetResult() {
		mathOperation = new MathOperation();
		return mathOperation.getLeftOperand() / mathOperation.getRightOperand();
}
}