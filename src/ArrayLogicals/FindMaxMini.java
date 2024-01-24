package ArrayLogicals;

public class FindMaxMini {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};
        int max=a[0];
        int min =b[0];
        for(int i=0;i< a.length;i++)
        {if (a[i]>max){
            max=a[i];
        }

        }
        System.out.println("The maximum value in array a is ="+max);

        for(int i=0;i< b.length;i++)
        {if (b[i]<min){
            min=b[i];
        }

        }
        System.out.println("The minimum value in array b is ="+min);
    }
}
