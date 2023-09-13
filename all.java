import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class all {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("\nQueue: " + queue);

        String front = queue.remove();
        System.out.println("\nRemoved element: " + front);

        System.out.println("\nQueue after removal: " + queue);

        queue.add("date");

        String peeked = queue.peek();
        System.out.println("\nPeeked element: " + peeked);

        System.out.println("Queue after peek: " + queue);

        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println("\nInitial Stack: " + stack + "");

        System.out.println("The element at the top of the" + " stack is: " + stack.peek() + "");

        System.out.println("Final Stack: " + stack + "\n" + "");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int i : myNumbers) {
            System.out.println(i + "\n");
        }

        LinkedList<String> cars = new LinkedList();
        cars.add("BMW");
        cars.add("Bently");
        cars.add("Lamborghini");
        cars.add("Ferarri");
        cars.add("Koenigsegg");

        System.out.println(cars + "");
    }
}