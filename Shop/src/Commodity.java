
public class Commodity extends Item {

	public Commodity(String name, double price) {
		super(name, price);
	}

	public double getPrice() {
		return super.getPrice() + super.getPrice() * 0.21;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
