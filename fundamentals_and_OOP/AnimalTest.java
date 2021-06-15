public class AnimalTest {
    public static void main(String[] args){

        Animal koala = new Animal("Koala", "Grey");
        koala.speak();

        Dog cinder = new Dog("Cinder", "Very Black", 9000);
        System.out.println(cinder);

        cinder.speak();
    }
}