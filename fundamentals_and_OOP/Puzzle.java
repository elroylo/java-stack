import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Puzzle {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        String[] randomName = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        int[] randNum = {3,5,1,2,7,9,8,13,25,32};


        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
    }
    static public void printRandomNumber(){
        Random myRandom = new Random();
        int randomInt = myRandom.nextInt(10) + 1;
        System.out.println(randomInt);
    }

    static public int returnRandomNumber(int n) {
        Random myRandom = new Random();
        return myRandom.nextInt(n) + 1;
    }

    static public void createRandomArray() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 1; i < 15; i++) {
            nums.add(Puzzle.returnRandomNumber(i));
        }

        System.out.println(nums);
    }

    static public void createRandomList() {
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        int[] nums = new int[15];
        for(int i = 0; i < 15; i++) {
            // nums.add(Puzzle.returnRandomNumber(i));
            nums[i] = Puzzle.returnRandomNumber(100);
        }

        System.out.println(Arrays.toString(nums));
    }


}