package stringlogical;

public class PaledormString {
    public static void main(String[] args) {
        String s = "MOM";
        String o = s;
        String rev = "";
        System.out.println("The given String is = "+s);
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (o.equals(rev)) {
            System.out.println("The String is peledorm ");
        } else {
            System.out.println("The String is not peledorm");
        }

    }


}
