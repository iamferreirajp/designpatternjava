public class TrechoAPe implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoAPe(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println("Vá andando: ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida será de: "+ this.distancia +" metros .");
	}
}