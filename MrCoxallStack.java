// Class for the Mr Coxall Stack program

import java.util.ArrayList;

/**
* MrCoxallStack class.
*/
public final class MrCoxallStack {

    /**
    * Creates stackAsArray as an ArrayList.
    */
    private static ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MrCoxallStack() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Function for pushing a number to the stack.
    *
    * @param pushNumber Number to be pushed into stack
    */
    public static void push(final int pushNumber) {
        stackAsArray.add(0, pushNumber);
    }

    /**
    * Function for showing the stack.
    */
    public static void showStack() {
        System.out.println("The stack as an array is " + stackAsArray);
    }
}

