package myquestion4;

public class USDollarAccount implements MYExchangeRate
{
	static final float EXCHANGE_RATE = 0.75f;
	protected float balance;
	
	public  void Credit(float amount)
	{
		balance += amount * EXCHANGE_RATE;
	}

	public  void Debit(float amount)
	{
		balance -= amount * EXCHANGE_RATE;
	}
	
}


