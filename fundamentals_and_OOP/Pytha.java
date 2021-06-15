import java.util.Scanner;
import java.lang.Math;
public class Pytha {
    public static void main(String[] args){
        System.out.println("Enter first side triangle: ");

        Scanner input = new Scanner(System.in);
        double second = input.nextDouble();

        System.out.println("Enter 2nd side of triangle: ");
        double third = input.nextDouble();
        
        double first = (Math.pow(second,2)) + (Math.pow(third,2));

        System.out.println("1st number: " + second);
        System.out.println("2nd number: " + third);
        System.out.println("result: " + first);

        input.close(); 
    }
}