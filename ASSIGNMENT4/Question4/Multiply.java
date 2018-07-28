public class Multiply extends MathOperation{
	private int leftOperand;
	private int rightOperand;

	@Override
	public int GetResult() {
		return leftOperand * rightOperand;
	}
}