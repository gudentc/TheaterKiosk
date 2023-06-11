import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declare Variables
        int age = 0;
        String trash = "";

        // Input and test
        System.out.print("\nEnter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // Clears the buffer

        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid age if not " + trash);
            System.out.println("Rerun the program!");
            System.exit(0);
        }
        // Here we have a valid integer
        // Output of the results.
        if (age >= 21) {
            System.out.println("\nYou are at least 21 and receive a wristband!");
        }
        else {
            System.exit(0);
        }
    }
}