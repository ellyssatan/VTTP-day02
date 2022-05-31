package mypackage;

// import collection framework
import java.util.*;

public class DataStructure {
    public static void main(String[] args) {
        
        // Create list of int
        // List - generics
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(0);
        intList.add(1);
        intList.add(0, 1000);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d = %d\n",i, intList.get(i));
        }
    }
}
