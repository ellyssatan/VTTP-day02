package mypackage;

public class SumAll {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            total += num;
            //System.out.printf("i = %d, value = %s\n", i, args[i]);
        }
        System.out.println("The sum is " + total);
    }
}
