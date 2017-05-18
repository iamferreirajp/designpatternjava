public class TesteHalflingThief {
	public static void main(String[] args) {
		HalflingThief thief = new HalflingThief(new HitAndRunMethod());
		thief.steal();
		thief.changeMethod(new SubtleMethod());
		thief.steal();
	}
}