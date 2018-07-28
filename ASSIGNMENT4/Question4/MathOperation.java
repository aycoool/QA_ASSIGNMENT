public class MathOperation {
	public enum OperationType {
		DIVIDE, MULTIPLY, ADD, SUBTRACT
	}

	public MathOperation() {

	}

	private int leftOperand;
	private int rightOperand;
	private OperationTypeState operationTypeState;
	private OperationType operationType;

	public int getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}

	public int getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(int rightOperand) {
		this.rightOperand = rightOperand;
	}

	public MathOperation(OperationType operationType, int leftOperand,
			int rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operationType = operationType;
		setOperationType(operationType);
	}

	public OperationType getOperationType() {
		return operationTypeState.getOperationType();
	}

	public void setOperationType(OperationType type) {
		switch (type) {
		case DIVIDE:
			operationTypeState = new Divide();
			break;
		case MULTIPLY:
			operationTypeState = new Multiply();
		case ADD:
			operationTypeState = new Add();
			break;
		case SUBTRACT:
			operationTypeState = new Subtract();
			break;
		default:
			break;
		}
	}

	public int GetResult() {
		return operationTypeState.GetResult();
	}

}