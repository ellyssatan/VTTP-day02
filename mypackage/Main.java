package mypackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("good morning, world");

        // Create String array - Instantiate the array
        String[] todos = new String[5];

        // Assign values to array
        todos[0] = "learn Java";
        todos[1] = "practice Java";
        todos[2] = "Jog";
        todos[3] = "Swim";
        todos[4] = "Run";

        System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value = %s\n", 1, todos[1]);
        System.out.printf("Index: %d: value = %s\n", 2, todos[2]);
        System.out.printf("Index: %d: value = %s\n", 3, todos[3]);
        System.out.printf("Index: %d: value = %s\n", 4, todos[4]);

        // Every array has a property called length
        System.out.printf("Size of todos: %d\n", todos.length);

        // Size of args
        System.out.printf("Size of args: %d\n", args.length);

        // args = parameters into program
        System.out.printf("args: %d: value = %s\n", 0, args[0]);
        System.out.printf("args: %d: value = %s\n", 1, args[1]);




    }
}
