<<<<<<< HEAD
/*
* Mr Coxall Stack class
* Created Dec 8, 2021
*/
=======
// Class for the Mr Coxall Stack program
>>>>>>> 5e596240d6ef7ba11f056c59c7fd66de5ffdb955

import java.util.ArrayList;

/**
* MrCoxallStack class.
*/
<<<<<<< HEAD
public class MrCoxallStack {

    /**
    * Creates arrayList for the stack.
    */
    private static ArrayList<Integer> aStack = new ArrayList<Integer>();

    /**
    * Getter for aStack arrayList.
    *
    * @return aStack arrayList
    */
    public ArrayList<Integer> getStack() {
        return this.aStack;
    }

    /**
    * Method for push a number into stack.
    *
    * @param pushNumber number to be added to stack
    */
    public void push(final int pushNumber) {
        aStack.add(0, pushNumber);
    }

    /**
    * Method for displaying the stack ot user.
    */
    public void showStack() {
        System.out.println("The stack as an array is " + aStack);
    }

    /**
    * Method for taking a number out of the stack.
    *
    * @return the first element taken out of the stack list
    */

    public int pop() {
        final int firstElement = aStack.get(0);
        aStack.remove(0);
        return firstElement;
=======
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
>>>>>>> 5e596240d6ef7ba11f056c59c7fd66de5ffdb955
    }
}

