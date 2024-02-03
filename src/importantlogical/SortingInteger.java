package importantlogical;

import java.util.Collections;
import java.util.List;

public class SortingInteger {

    public static void main(String[] args) {
        List<Integer> i = List.of(12, 25, 66, 02, 89, 24, 04, 16);
        System.out.println("Sorting in Ascending Order-------->");
        i.stream().sorted().forEach(System.out::println);
        System.out.println("Sorting in Descending Order-------->");
        i.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
