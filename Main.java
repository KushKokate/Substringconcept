import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the input string
        String input = in.next();

        int start = in.nextInt();
        int end = in.nextInt();

        // Check if start and end are within bounds
        if (start >= 0 && start < input.length() && end >= 0 && end <= input.length()) {
            String substring = input.substring(start, end);
            System.out.println(substring);
        } else {
            System.out.println("Invalid start or end values.");
        }
    }
}
