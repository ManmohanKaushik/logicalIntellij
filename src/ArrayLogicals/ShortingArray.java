package ArrayLogicals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortingArray {
    public static void main(String[] args) {
        // by using Java8
        Integer a[] = {45, 20, 89, 23};
        List<Integer> list = Arrays.asList(a);

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

        System.out.println("Natural Sorting Order " + collect);

        List<Integer> collect1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Custmoried Sorting Order " + collect1);

    }
}
