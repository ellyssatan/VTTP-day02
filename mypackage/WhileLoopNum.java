package mypackage;

import java.io.Console;

public class WhileLoopNum {
    public static void main(String[] args) {
        Console cons = System.console();
        
        String input = "abc";
        int total = 0;
        int count = 0;

        while (input.length() > 0) {
            if (count == 0) {
               input = cons.readLine("Enter a number. Blank to end \n"); 
            } else {
                input = cons.readLine();
            }
            
            if (input.length() > 0) {
                int num = Integer.parseInt(input);
                //System.out.printf(">>> %s\n", input);
                count ++;
                total += num;
                //input = cons.readLine();
            }
            
        }
        System.out.println("The sum is " + total);
    }
}
