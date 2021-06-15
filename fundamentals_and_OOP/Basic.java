import java.util.*;

public class Basic {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i < 256; i++) {
                System.out.print("Num: " + i);
                sum = sum + i;
                System.out.print(" Sum: " + sum + "\n");

        }
    }
}

