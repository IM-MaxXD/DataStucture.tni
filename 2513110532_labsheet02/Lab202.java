import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lastDigitId = 2;
        int secondLastDigitId = 3;
        int currentDate = 9;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 0; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }

        System.out.print("Enter a number to append at the end: ");
        int numAppend = scan.nextInt();
        numbers.add(numAppend);

        System.out.print("Enter a number to insert at index " + lastDigitId + ": ");
        int numInsert = scan.nextInt();
        numbers.add(lastDigitId, numInsert);

        numbers.remove(lastDigitId);

        numbers.set(secondLastDigitId, currentDate);

        System.out.println("Final elements in ArrayList = " + numbers);

        scan.close();
    }
}
