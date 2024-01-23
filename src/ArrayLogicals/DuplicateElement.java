package ArrayLogicals;

public class DuplicateElement {
    public static void main(String[] args) {
        String string[] = {"ram", "sham", "shiv", "uma", "ram"};
        boolean check = false;
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    System.out.println("The duplicate value is = " + string[i]);
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println("No duplicate value is not found in array");
        }
    }

}
