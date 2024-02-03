package numberlogical;

public class PaledromNo {
    public static void main(String[] args) {
        int a=12321;
        int t=a;
        int rev=0;
        System.out.println("The no is "+a);
        while (a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }if (t==rev) {
            System.out.println("The given is  paledorm ");
        }
        else {
            System.out.println("The given no is not paledorm");
        }
    }
}
