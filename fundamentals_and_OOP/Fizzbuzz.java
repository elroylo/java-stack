import java.util.Scanner;
public class FizzBuzz {
    public String fizzBuzz(int number) {        // fizzbuzz logic here
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your number is:" + number);
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number == 2){
            return "2";
        }
        return "End";
    }   
}