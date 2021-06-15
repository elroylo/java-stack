public class Dog extends Animal{

    private int loyalty;

    public Dog(String name, String color, int loyalty){
        super(name, color);
        this.setLoyalty(loyalty);
    }

    public void speak(){
        super.speak();
        System.out.println("And I am " + this.getLoyalty() + " Loyal");
    }

    public int getLoyalty(){
        return loyalty;
    }

    public void setLoyalty(int loyalty){
        this.loyalty = loyalty;
    }
}