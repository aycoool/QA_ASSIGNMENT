public class Subtract extends  MathOperation {
	private int leftOperand;
	private int rightOperand;

	@Override
	public int GetResult() {
		return leftOperand - rightOperand;
	}
}