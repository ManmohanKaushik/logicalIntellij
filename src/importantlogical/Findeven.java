package importantlogical;

import java.util.List;

public class Findeven {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 33, 45, 65, 30);
        Integer i1 = list.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .get();
        System.out.println("The first even no in the list is = "+i1);
    }

}
