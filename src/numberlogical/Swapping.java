package numberlogical;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int x = 50;
        int b = 20;
        int y = 100;

        System.out.println("Before swapping the value of a = " + a + " and b = " + b);
        // for 1st approach
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping the value of a = " + a + " and b = " + b);
// for 2nd approach
        System.out.println("Before swapping the value of x = " + x + " and y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping the value of x = " + x + " and y = " + y);
    }
}
