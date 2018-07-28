public class Divide  extends MathOperation{
	private int leftOperand;
	private int rightOperand;
	public Divide(int leftOperand, int rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand= rightOperand;
	}
	@Override
	public int GetResult() {
		return leftOperand / rightOperand;
}
}