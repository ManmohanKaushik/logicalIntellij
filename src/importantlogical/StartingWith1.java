package importantlogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartingWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 56, 89, 14, 56, 79, 66, 22, 31, 13);
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
