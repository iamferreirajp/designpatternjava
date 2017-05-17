public class TestCoquetel {
	public static void main(String[] args) {
		Coquetel coquetel = new Cachaca();
		System.out.println(coquetel.getName() + " = " + coquetel.getPrice());
	
		coquetel = new Gelo(coquetel);

		System.out.println(coquetel.getName() + " = " + coquetel.getPrice());
	
		coquetel = new Acucar(coquetel);

		System.out.println(coquetel.getName() + " = " + coquetel.getPrice());
	
	}
}