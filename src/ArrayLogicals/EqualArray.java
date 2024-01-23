package ArrayLogicals;

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        //By first approach
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};
        boolean equals = Arrays.equals(a, b);
        System.out.println("By first approach the arrays are equals is = " + equals);
// By second approach
        int c[] = {1, 2, 3, 4, 5, 6, 7};
        int d[] = {1, 2, 3, 4, 5, 6, 7};
        boolean status = true;
        if (c.length == d.length) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] != d[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }
        if (status == true) {
            System.out.println("Both array c and d are equals ");
        } else {
            System.out.println("Both array c and d are not  equals ");
        }
    }
}
