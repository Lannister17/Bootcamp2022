package conditionals;

public class conditionals {
    public static void main(String[] args) {
        boolean condition1 = true, condition2 = false;
        int number = 24;

        if (condition1) {
            System.out.println("inside of condition1 (working here) ");
        }else {
            System.out.println("otherside of condition1");
        }

        if (condition2) {
            System.out.println("if condition is true");
        }else if (number >20) {
            System.out.println("Number Condition ( working here )");
        }else {
            System.out.println("if codition2 is false");
        }

    }
}
