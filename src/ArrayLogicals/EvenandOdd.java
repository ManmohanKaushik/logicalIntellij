package ArrayLogicals;

import java.util.Arrays;
import java.util.List;

public class EvenandOdd {
    public static void main(String[] args) {
        // first approach
        int c[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Even no in array are = ");
        for (int i : c) {
            if (i % 2 == 0) {
                System.out.println(" " + i);
            }

        }
        System.out.println("Odd no in array are = ");
        for (int j : c) {
            if (j % 2 != 0) {
                System.out.println(" " + j);
            }
        }
        //By java8
        System.out.println("By using Java8 feature the Even no are ");
        Arrays.stream(c).filter(e -> (e % 2 == 0)).forEach(System.out::println);
        System.out.println("By using Java8 feature the Odd no are ");
        Arrays.stream(c).filter(e -> (e % 2 != 0)).forEach(System.out::println);
    }
}
