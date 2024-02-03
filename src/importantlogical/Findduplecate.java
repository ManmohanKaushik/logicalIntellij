package importantlogical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findduplecate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 30, 45, 69, 30,12);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(i->!set.add(i))
                .forEach(System.out::println);
    }
}
