public class OpenGLImagemAdapter extends OpenGLImage implements ImagemTarget {

	public void carregaImagem(String arquivo) {
		glCarregarImagem(arquivo);
	}

	public void desenhaImagem(int posX, int posY, int largura, int altura){
		glDesenharImagem(posX, posY);
	}
}