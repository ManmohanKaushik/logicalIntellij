package numberlogical;

public class ReversNo {

    public static void main(String[] args) {
        int a = 1234;
        int rev=0;
        System.out.println("The original no is "+a);
        while (a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("Revers the no is = "+rev);
    }

}
