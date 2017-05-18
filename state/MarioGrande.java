public class MarioGrande implements MarioState {

	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	public MarioState pegarFlor() {
		System.out.println("Mario grande com flor");
		return new MarioFogo();
	}

	public MarioState pegarPena() {
		System.out.println("Mario grande com capa");
		return new MarioCapa();
	}

	public MarioState levarDano() {
		System.out.println("Mario pequeno");
		return new MarioPequeno();
	}

}