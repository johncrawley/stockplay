package money;

public class Money {

	private long value;
	
	
	public Money(long amount) {

		this.value = amount * 100;
	}
	
	
	public long value() {
		return value;
	}
	
	public String toString() {
		long pounds = value / 100;
		return "" + pounds + "."  + (value - pounds);
	} 
	
	public Money increment(Money sum) {
		value += sum.value;
		return new Money(value);
	}
	
	public Money decrement(Money sum) {
		value -= sum.value;
		return new Money(value);
	}

}
