public class Acucar extends CoquetelDecorator {
	public Acucar (Coquetel coquetel){
		super(coquetel);
		name = "Açucar";
		price = 0.20;
	}
}