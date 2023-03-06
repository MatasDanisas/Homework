
public class Alcohol extends Commodity {
	private double percent;
	private double volume;

	public Alcohol(String name, double price, double percent, double volume) {
		super(name, price);
		this.percent = percent;
		this.volume = volume;
	}

	public double getPrice() {
		if (percent <= 15) {
			return super.getPrice() + volume * 0.89;
		} else
			return super.getPrice() + volume * 1.26;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
