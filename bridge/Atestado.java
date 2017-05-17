public class Atestado implements Documento {
	private String nome;
	private GeradorDeArquivo gerador;

	public Atestado(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}

	public void gerarArquivo() {
		String conteudoDesseAtestado = ("O conteúdo desse atestado é referente ao: " + this.nome);

		this.gerador.geraDocumento(conteudoDesseAtestado);
	}
}