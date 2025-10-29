import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();  // ✅ Corrected nextInt()

        int fact = 1;  // Variable to store factorial

        // ✅ Correct loop
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // ✅ Print final result
        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
}
