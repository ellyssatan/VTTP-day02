package mypackage;

import java.io.Console;

public class WhileLoopNumAns {
    public static void main(String[] args) {
        Console cons = System.console();

        // Variable to hold the result
        int result = 0;
        int opnd = 0;
        String input = "";

        // Controls loop
        boolean stop = false;

        while (!stop) {
            input = cons.readLine("Enter a number. Blank to end "); 
            if (input.length() > 0) {
                opnd = Integer.parseInt(input);
                result += opnd;
            } else
                stop = true;
        }
        System.out.println("The sum is " + result);
    }
}
