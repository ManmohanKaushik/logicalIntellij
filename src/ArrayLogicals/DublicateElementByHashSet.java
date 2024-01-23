package ArrayLogicals;

import java.util.HashSet;

public class DublicateElementByHashSet {
    public static void main(String[] args) {
        String string[] = {"ram", "sham", "shiv", "uma", "ram"};
        HashSet<String> set = new HashSet<>();
        boolean a=false;
        for (String s:string){
            if(set.add(s)==false){
                System.out.println("The duplicate value in the array is = "+s);
                a=false;
            }
        }
        if (a==true){
            System.out.println("No duplicate value is not found in array ");
        }
    }
}
