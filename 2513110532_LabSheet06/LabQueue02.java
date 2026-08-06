import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter some message: ");
		String message = input.next();

		System.out.println();
		System.out.println("Check Palindrome by Deque = "
				+ (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
		System.out.println("Check Palindrome by Stack = "
				+ (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

	}

	public static boolean checkByDeque(String message) {
		Deque<Character> letters = new ArrayDeque<Character>();

		for (int i = 0; i < message.length(); i++) {
			letters.add(message.charAt(i));
			letters.push(message.charAt(i));
		}

		while (letters.size() > 1) {
			if (letters.pollFirst() != letters.pollLast()) {
				return false;
			}
		}
		
		return true;
	}

	public static boolean checkByStack(String message) {
		Queue<Character> queue = new ArrayDeque<Character>();
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i = 0; i < message.length(); i++) {
			queue.add(message.charAt(i));
			stack.push(message.charAt(i));
		}

		while (!queue.isEmpty()) {
			if (queue.poll() != stack.pop()) {
				return false;
			}
		}
		
		return true;
	}

}