public class TestComposite {
	public static void main(String[] args){
		Trecho trecho1 = new TrechoAPe("Vire a esquerda",500);
		Trecho trecho2 = new TrechoTaxi("Vire a direita no parquinho", 1000);
		Trecho trecho3 = new TrechoAviao("Viaje pelo atlântico", 10000000);
	

		Caminho caminho1 = new Caminho();
		caminho1.adicionaTrecho(trecho1);
		caminho1.adicionaTrecho(trecho2);
		caminho1.adicionaTrecho(trecho3);

		System.out.println("Caminho 1:");
		caminho1.imprime();

		Caminho caminho2 = new Caminho();
		caminho2.adicionaTrecho(caminho1);
		caminho2.adicionaTrecho(trecho1);
		caminho2.adicionaTrecho(trecho2);
		System.out.println("---------------------");
		System.out.println("Caminho 2: ");
		caminho2.imprime();
	}
}