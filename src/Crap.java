import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String again = "";

        do {


            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            int sum2;


            System.out.printf("%-7s %d", "Dice 1:", dice1);
            System.out.printf("\n%-7s %d", "Dice 2:", dice2);
            System.out.printf("\n%-4s %d", "Sum:", sum);
            System.out.println(" ");

            if (sum == 7 || sum == 11) {
                System.out.println("Natural!");
                System.out.println("You Win!!");

                System.out.println("Play again? [Y/N]");
                again = scan.nextLine();

                if (again.equalsIgnoreCase("n")) {
                    break;
                }

            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Crap");
                System.out.println("You lose");

                System.out.println("Play again? [Y/N]");
                again = scan.nextLine();

                if (again.equalsIgnoreCase("n")) {
                    break;
                }

            } else {

                while (true){
                    System.out.println("");
                    System.out.println("We go next");

                    dice1 = (int) (Math.random() * 6) + 1;
                    dice2 = (int) (Math.random() * 6) + 1;

                    sum2 = dice1 + dice2;

                    System.out.printf("%-7s %d", "Dice 1:", dice1);
                    System.out.printf("\n%-7s %d", "Dice 2:", dice2);
                    System.out.printf("\n%-4s %d", "Sum:", sum2);
                    System.out.println(" ");

                    if (sum2 == sum) {
                        System.out.println("You win");

                        System.out.println("Play again? [Y/N]");
                        again = scan.nextLine();

                        if (again.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                    if (sum2 == 7) {
                        System.out.println("you lose");

                        System.out.println("Play again? [Y/N]");
                        again = scan.nextLine();

                        if (again.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                }
            }
        } while (!again.equalsIgnoreCase("n"));
    }
}
