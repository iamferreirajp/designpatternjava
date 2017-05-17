public class TesteFacade {
	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade facade = new SistemasFacade();
		facade.iniciarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		facade.utilizarSubsistemas("imagem.png","teste.mp3");
	}
}