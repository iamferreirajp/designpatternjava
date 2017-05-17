public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {

	public void carregaImagem(String arquivo) {
		SDL_CarregarSurface(arquivo);
	}

	public void desenhaImagem(int posX, int posY, int largura, int altura) {
		SDL_DesenharSurface(largura, altura, posX, posY);
	}
}