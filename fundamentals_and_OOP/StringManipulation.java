import java.util;
import java.lang.Math;
public class StringManipulation {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld
    }
}

