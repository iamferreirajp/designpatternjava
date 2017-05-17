public class OpenGLImage {
	public void glCarregarImagem(String arquivo) {
		System.out.println("Imagem" + arquivo + " carregada");
	}

	public void glDesenharImagem(int posicaoX, int posicaoY) {
		System.out.println("Imagem OpenGL desenhada na posiçãoX: "+ posicaoX +" e posiçãoY: "+ posicaoY);
	}
}