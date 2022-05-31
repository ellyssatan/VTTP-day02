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
        String item;

        // main loop
        while (!stop) {
            input = cons.readLine("> ");

            String[] terms = input.split(" ");

            switch (terms[0]) {
                case "add":
                    if (terms.length < 2) {
                        System.err.println("Please provide an item to add");
                    } else {
                        for (int i = 1; i < cart.size(); i++) {
                            item = terms[i];
                            cart.add(item);
                            System.out.printf("%s added to cart\n", item);

                            for (int k = 0; k < cart.size(); k++) {
                                if (item.equals(cart.get(k)))
                                cart.remove(item);
                                System.out.printf("You have %s in your cart\n", item);
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
                            cart.remove(delIndex);
                            System.out.printf("%s removed from cart\n", cart.get(delIndex));
                    }
                    break;
                    
                case "end":
                    break;

                    
            }
        }
    }
}
