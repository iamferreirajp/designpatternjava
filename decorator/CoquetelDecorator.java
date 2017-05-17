public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;

	public CoquetelDecorator(Coquetel coquetel) {
		this.coquetel = coquetel;
	}

	@Override
	public String getName() {
		return coquetel.getName() + " + " + name;
	}

	public double getPrice() {
		return coquetel.getPrice() + price;
	}
}