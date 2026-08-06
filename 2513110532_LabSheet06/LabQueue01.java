import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
    public static void main(String[] args) {
 
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 101; i <= 105; i++) {
        	queue.add(i);
            System.out.println("Enqueue: " + i);
            
        }
        
        System.out.println("Queue => " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Calling number: " + queue.peek());
            System.out.println("Providing service number: " + queue.poll());
        }
        
        System.out.println("Queue => " + queue);
    }
}