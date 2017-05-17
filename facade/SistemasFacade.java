public class SistemasFacade {
	protected SistemaDeAudio audio;
	protected SistemaDeInput input;
	protected SistemaDeVideo video;

	public void iniciarSubsistemas() {
		video = new SistemaDeVideo();
		video.configurarCores();
		video.configurarResolucao();

		input = new SistemaDeInput();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new SistemaDeAudio();
		audio.configurarFrequencia();
		audio.configurarVolume();
		audio.configurarCanais();
	}

	public void utilizarSubsistemas(String arquivo, String imagem){
		audio.reproduzirAudio(arquivo);
		video.renderizarImagem(imagem);
		input.lerInput();
	}
}