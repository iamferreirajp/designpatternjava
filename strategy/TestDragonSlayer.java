public class TestDragonSlayer {
	public static void main(String[] args){
		System.out.println("Green Dragon spotted ahead!");
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		dragonSlayer.goToBattle();

		System.out.println("Red Dragon emerges!");
		dragonSlayer.changeStrategy(new ProjectileStrategy());
		dragonSlayer.goToBattle();

		System.out.println("Black Dragon lands before you!");
		dragonSlayer.changeStrategy(new SpellStrategy());
		dragonSlayer.goToBattle();
	}
}