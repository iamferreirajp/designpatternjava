public class TrechoOnibus implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoOnibus(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println("Vá de busão: ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida será de: "+ this.distancia +" metros .");
	}
}