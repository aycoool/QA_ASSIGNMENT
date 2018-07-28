public class Subtract extends  MathOperation {
	private int leftOperand;
	private int rightOperand;
	
	public Subtract(int leftOperand, int rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	@Override
	public int GetResult() {
		return leftOperand - rightOperand;
	}
}