public class HitAndRunMethod extends StealingMethod {

	protected String pickTarget() {
		return "old goblin woman";
	}

	protected void confuseTarget(String target) {
		System.out.println("Approach the " + target + " from behind.");
	}

	protected void stealTheItem(String target) {
		System.out.println("Grab the handbag and run away fast!");
	}


}