public class TestAdapter {
	public static void main(String[] args) {
		ImagemTarget imagem = new SDLImagemAdapter();
		imagem.carregaImagem("teste.png");
		imagem.desenhaImagem(1,1,10,10);
		
		imagem = new OpenGLImagemAdapter();
		imagem.carregaImagem("teste.png");
		imagem.desenhaImagem(1,1,10,10);


	}
}