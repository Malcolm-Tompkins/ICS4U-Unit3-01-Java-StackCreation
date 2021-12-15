<<<<<<< HEAD
// Mr Coxall Stack main class.
// Created Dec 8th, 2021

/**
* Main class. 
*/
final class Main {
    /**
    * Constant for number 10.
    */
    public static final int MAGIC_10 = 10;
    /**
    * Constant for another magic number.
    */
    public static final int MAGIC_NUMBER = 100;
=======
//
// This program runs the MrCoxallStack program
//

/**
* Main class.
*/
final class Main {

    /**
    * Constant for first pushNumber.
    */
    private static final int PUSH_NUMBER1 = 56;

    /**
    * Constant for second pushNumber.
    */
    private static final int PUSH_NUMBER2 = 1;

>>>>>>> 5e596240d6ef7ba11f056c59c7fd66de5ffdb955
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
<<<<<<< HEAD
    * Main() function.
    *
    * @param args unused argument
    */
    public static void main(String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        System.out.println("Push 10: ");
        aStack.push(MAGIC_10);
        aStack.showStack();
        final int popedNumber = aStack.pop();
        System.out.println("The popped number is: " + popedNumber);
        aStack.showStack();
        }
=======
    * Main function.
    *
    * @param args Unused parameter
    */
    static void main(String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        System.out.println("Push 56 to stack:");
        aStack.push(PUSH_NUMBER1);
        aStack.showStack();
        System.out.println("Push 1 to the stack:");
        aStack.push(PUSH_NUMBER2);
        aStack.showStack();
    }
>>>>>>> 5e596240d6ef7ba11f056c59c7fd66de5ffdb955
}

