public class Calculator
{
	public static int Divide(int left, int right)
	{
		Divide op = new Divide();
		return op.GetResult();
	}

	public static int Multiply(int left, int right)
	{
		Multiply op = new Multiply();
		return op.GetResult();
	}

	public static int Add(int left, int right)
	{
		Add op = new Add();
		return op.GetResult();
	}

	public static int Subtract(int left, int right)
	{
		Subtract op = new Subtract();
		return op.GetResult();
	}
}