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
}

