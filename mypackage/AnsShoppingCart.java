package mypackage;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class AnsShoppingCart {
    public static void main(String[] args) {
        
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        boolean stop = false;
        String input;
        int delIndex = 0;
        boolean exists = false;

        System.out.println("Welcome to your shopping cart");
        
        // main loop
        while (!stop) {
            input = cons.readLine("> ");
            String[] terms = input.split(" ");

            // System.out.println(terms[0]);

            switch (terms[0]) {
                case "add":
                    if (terms.length < 2) {
                        System.err.println("Please provide an item to add");
                    } else {
                        // loop through words in input
                        for (int k = 1; k < terms.length; k++) {
                            // assume not found
                            exists = false;
                            // loop through cart items
                            for (int i = 0; i < cart.size(); i++) {
                                if (terms[k].equals(cart.get(i))) {
                                    exists = true;
                                    System.out.printf("You have %s in your cart\n", terms[k]);
                                    // drop out of loop once found
                                    break;
                                }
                            }
                            if (!exists) {
                            cart.add(terms[k]);
                            System.out.printf("%s added to cart\n", terms[k]);
                            }
                        }
                    }
                    break;
                
                case "list":
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty");
                    }
                    break;
                
                case "delete":
                    if (terms.length < 2) {
                        System.err.println("Please provide an index to delete");
                    } else {
                        delIndex = Integer.parseInt(terms[1])-1;
                        if (delIndex < cart.size())
                            System.out.printf("%s removed from cart\n", cart.get(delIndex));
                            cart.remove(delIndex);
                    }
                    break;
                    
                case "end":
                    System.out.println("Thank you for shopping with us");
                    
                    stop = true;
                    break;
                
                default:
                System.out.println("Please enter valid command");
                    

                    
            }
        }
    }
}
