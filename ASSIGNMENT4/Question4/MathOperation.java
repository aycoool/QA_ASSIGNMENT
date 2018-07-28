public abstract class MathOperation implements OperationResult {
	
	public MathOperation() {

	}

	private int leftOperand;
	private int rightOperand;
	private OperationResult operationResult;

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

	public int GetResult() {
		return operationResult.GetResult();
	}

}