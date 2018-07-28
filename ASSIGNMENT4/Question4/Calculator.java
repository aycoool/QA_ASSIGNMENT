public class Calculator
{
	public static int Divide(int left, int right)
	{
		Divide op = new Divide(left, right);
		return op.GetResult();
	}

	public static int Multiply(int left, int right)
	{
		Multiply op = new Multiply(left, right);
		return op.GetResult();
	}

	public static int Add(int left, int right)
	{
		Add op = new Add(left, right);
		return op.GetResult();
	}

	public static int Subtract(int left, int right)
	{
		Subtract op = new Subtract(left, right);
		return op.GetResult();
	}
}