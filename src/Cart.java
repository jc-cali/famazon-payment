public class Cart {

    public static void sayGoodbye() {
        System.out.println("Thanks for using Famazon Cart");
    }
    public static void sayHello() {
        System.out.println("Famazon Cart v 1.0 *started*");
    }

    public static void main(String[] arguments) {
        sayHello();
        boolean doWeHaveArguments = false;
        //String argsLength = arguments.length.toString();
        // bad code, fixing below
        int length = arguments.length;

        if (length >= 1) {
            doWeHaveArguments = true;
        }
        if (doWeHaveArguments == true) {
            // if true let the user know awesome but they are not needed
            System.out.println("Awesome, but they are not needed.");
        } else {
            // otherwise let them know thanks
            // for not spamming
            System.out.println("Thanks for not spamming.");
        }
        sayGoodbye();
    }
}