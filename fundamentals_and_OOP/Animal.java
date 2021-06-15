public class Animal { // PascalCase, camelCase
    private String name;
    private String color;

    public Animal(String n, String c) {
        this.setName(n);
        this.setColor(c);
    }

    public Animal() {
        
    }

    // Animal example = new Animal();

    public void speak(){
        System.out.println("My name is " + this.getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
} 