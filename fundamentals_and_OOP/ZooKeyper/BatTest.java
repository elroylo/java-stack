public class DragonTest {
	public static void main(String[] args){
		Bat Wuhan = new Bat("Wuhan", 300);
		System.out.println(Wuhan);
		Wuhan.attackTown().attackTown().attackTown().displayEnergy();
		Wuhan.eatHumans().eatHumans().displayEnergy();
		Wuhan.fly().fly().displayEnergy();
	}
}