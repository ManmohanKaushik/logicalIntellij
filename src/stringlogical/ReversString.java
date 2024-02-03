package stringlogical;

public class ReversString {
    public static void main(String[] args) {
        String s="ShamSunder";
        String rev="";
        System.out.println("The given String is = "+s);
        int length = s.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Revers the String is = "+rev);
    }
}
