abstract class Money
{
	protected int amount;
	public boolean equals(Object object)
	{
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}
	static Dollar dollar(int amount)
	{
		return new Dollar(amount);
	}
	static Money franc(int amount)
	{
		return new Franc(amount);
	}
	abstract Money times(int multiplier); 
}

class Dollar extends Money
{
	private int amount = 10;
	Dollar(int amount)
	{
		this.amount = amount;
	}
	Money times(int multiplier)
	{
		return new Dollar(this.amount * multiplier);
	}
	@Override
	public boolean equals(Object object)
	{
		Dollar dollar = (Dollar) object;
		return this.amount == dollar.amount;
	 }
}

class Franc extends Money
{
	private int amount;
	Franc(int amount)
	{
		this.amount = amount;
	}
	Money times(int multiplier)
	{
		return new Franc(amount * multiplier);
	}
	@Override
	public boolean equals(Object object)
	{
		Franc franc = (Franc) object;
		return amount == franc.amount;
	}
}