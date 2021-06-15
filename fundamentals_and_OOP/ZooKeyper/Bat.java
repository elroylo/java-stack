public class Bat extends Mammal {
	public Bat(String name, int energy){
		super(name, energy);
	}
	public Bat fly(){
		System.out.println("woosh");
		this.energy -= 50;
		return this;
	}
	public Bat eatHumans(){
		System.out.println("bite");
		this.energy += 25;
		return this;
	}
	public Bat attackTown(){
		System.out.println("raargh");
		this.energy -= 100;
		return this;
	}
}