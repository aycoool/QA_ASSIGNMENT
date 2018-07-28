public class Add extends OperationTypeState{
	private MathOperation mathOperation;
	@Override
	MathOperation.OperationType getOperationType() {
		return MathOperation.OperationType.ADD;
	}
	@Override
	public int GetResult() {
		mathOperation = new MathOperation();
		return mathOperation.getLeftOperand() + mathOperation.getRightOperand();
	}
}