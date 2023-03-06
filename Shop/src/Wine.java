
public class Wine extends Commodity{
	private double percent;
	private double volume;

	public Wine(String name, double price, double percent, double volume) {
		super(name, price);
		this.percent = percent;
		this.volume = volume;
	}
	
	public double getPrice() {
		if (percent <= 8.5) {
			return super.getPrice() + volume * 0.28;
		} else
			return super.getPrice() + volume * 0.72;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
