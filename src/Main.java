
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String answer = "yes";


        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter an integer:");
            int z = scan.nextInt();
            scan.nextLine();

            System.out.println("Number" + " \t " + "Squared" + " \t" + "Cubed");
            System.out.println("======" + " \t " + "======" + " \t" + "======");


            for (int i = 1; i <= z; i++) {

                System.out.println(i + "\t" + "\t" + " " + i * i + "\t" + "\t" + "\t" + i * i * i);

            }
            System.out.println("Continue? (yes/no)");
            answer = scan.nextLine();

        }


        while (answer.equals("yes"));
    }
}