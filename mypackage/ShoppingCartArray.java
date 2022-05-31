package mypackage;

// import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.util.*;

public class ShoppingCartArray {
    public static void main(String[] args) {
        
        Console cons = System.console();
        
        List<String> cart = new LinkedList<>();
        String input = cons.readLine("Welcome to your shopping cart\n");
        boolean exists = false;

        // list > return 
        while (input.length() > 0) {
            //input = cons.readLine("Welcome to your shopping cart\n");
            String[] terms = input.split(" ") ;
            switch (terms[0]) {
                case "list":
                    if (cart.size() == 0) {
                        System.out.println("Your cart is empty");

                    } else {
                        for (int k = 0; k < cart.size(); k++) {
                            System.out.printf("%d. %s\n", (k+1), cart.get(k));
                        }
                    }
                    input = cons.readLine();
                    break;
                
                case "add":
                    String item = input.substring(4);
                    exists = false;
                    for (int k = 0; k < cart.size(); k++) {

                        if (item.equals(cart.get(k))) {
                            exists = true;
                            System.out.printf("You have %s in your cart\n", item);
                        }
                    }
                    if (!exists) {
                        cart.add(terms[1]);
                        System.out.printf("%s added to cart\n", item);
                    }
                    input = cons.readLine();
                    break;
                
                case "delete":
                    item = input.substring(7);
                    int idx = Integer.parseInt(item)-1;

                    if (idx < cart.size()){
                        System.out.printf("%s removed from cart\n", cart.get(idx));
                        cart.remove(cart.get(idx));

                    } else {
                        System.out.println("Incorrect item index");
                    }
                    input = cons.readLine();
                
                default:
                    System.out.println("Please input valid command");
                    input = cons.readLine();
                    
        
        System.out.println("Thank you for shopping with us");
        // System.out.println();
            }
        }
    }
}
