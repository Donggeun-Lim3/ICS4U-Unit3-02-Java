/*
* This program uses the MrCoxallStack class.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-08
*/

import java.util.Scanner;

/** This class is StackForm. */
public final class StackForm {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private StackForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets some string input and shows reversed string.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final MrCoxallStack aStack = new MrCoxallStack();

        while (true) {
            String toPop;
            try {
                System.out.print("Enter the number to push on the stack: ");
                final int inputNumber = Integer.parseInt(myObj.nextLine());
                aStack.push(inputNumber);
                do {
                    System.out.print("\nDo you want to pop (the top element : "
                                     + aStack.peek() + ")? ");
                    toPop = myObj.nextLine().toUpperCase();
                    if ("y".equals(toPop) || "yes".equals(toPop)) {
                        System.out.println("\nThe top element : " + aStack.pop()
                                           + " is popped.");
                    }
                } while ("Y".equals(toPop) || "YES".equals(toPop));
                System.out.println("");
            }
            catch (IOException ex) {
                break;
            }
        }
        System.out.println("\nStack:");
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
