public class TesteRecibo {
	GeradorDeArquivo geradorArquivoPDF = new GeradorArquivoPDF();
	public static void main(String[] args) {
		Recibo recibo = new Recibo ("Banco do Brasil", "João Paulo", 1000, geradorArquivoPDF);
		recibo.gerarArquivo();
	}
}