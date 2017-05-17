import java.io.*;

public class GeradorArquivoPDF implements GeradorDeArquivo {

	GeradorArquivoPDF gerador = new GeradorArquivoPDF();

	Recibo recibo = new Recibo(gerador);
	recibo.gerarArquivo();

	Atestado atestado = new Atestado(gerador);
	atestado.gerarArquivo();

	public void geraDocumento(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivo.pdf");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}