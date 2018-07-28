
public class Subtract extends OperationTypeState {
	private MathOperation mathOperation;
	@Override
	MathOperation.OperationType getOperationType() {
		return MathOperation.OperationType.SUBTRACT;
	}

	@Override
	public int GetResult() {
		mathOperation = new MathOperation();
		return mathOperation.getLeftOperand() - mathOperation.getRightOperand();
	}
}