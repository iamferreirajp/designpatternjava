public class GeradorArquivoTxT implements GeradorDeArquivo {
	
	GeradorArquivoTxT gerador = new GeradorArquivoTxT();

	Recibo recibo = new Recibo(gerador);
	recibo.gerarArquivo();

	Atestado atestado = new Atestado(gerador);
	atestado.gerarArquivo();

	public void geraDocumento(String conteudo) {

	}
}