public class SubtleMethod extends StealingMethod {


	protected String pickTarget() {
		return "shop keeper";
	}

	protected void confuseTarget(String target) {
		System.out.println("Approach the "+ target +" with tears running and hug him!");
	}

	protected void stealTheItem(String target) {
		System.out.println("While in close contact grab the "+ target +"'s wallet.");
	}

}