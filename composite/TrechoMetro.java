public class TrechoMetro implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoMetro(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println("Vá de metrô: ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida será de: "+ this.distancia +" metros .");
	}
}