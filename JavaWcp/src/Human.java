public class Human {
	public static void main(String[] args) {
	
	Human human = new Human();
	Human.HumanLeg leg = human.new HumanLeg();
	leg.kick();
	
	}
	
	public class HumanLeg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
}
