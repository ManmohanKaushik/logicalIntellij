package stringlogical;

public class SwappingString {
    public static void main(String[] args) {
        String s = "Kavish";
        String k = "Kichu";
        System.out.println("Before Swapping s = " + s + " and k = " + k);
        s = s + k;
        k = s.substring(0, s.length() - k.length());
        s = s.substring(k.length());
        System.out.println("After Swapping s = " + s + " and k = " + k);
    }
}
