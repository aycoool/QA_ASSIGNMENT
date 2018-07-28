public class Multiply extends OperationTypeState{
	private MathOperation mathOperation;
	@Override
	MathOperation.OperationType getOperationType() {
		return MathOperation.OperationType.MULTIPLY;
	}
	@Override
	public int GetResult() {
		mathOperation = new MathOperation();
		return mathOperation.getLeftOperand() * mathOperation.getRightOperand();
	}
}