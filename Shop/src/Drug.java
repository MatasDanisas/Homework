
public class Drug extends Item {
	public Drug(String name, double price) {
		super(name, price);
	}

	public String getName() {
		return super.getName();
	}
	
	public double getPrice() {
		return super.getPrice() + super.getPrice() * 0.09;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
