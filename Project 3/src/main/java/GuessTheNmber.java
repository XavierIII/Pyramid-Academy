import java.util.Random;
import java.util.Scanner;

public class GuessTheNmber {
    public static void main(String[] args){
        System.out.println("Hello! What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Well " + name + ",I am thinking of a number between 1 and 20." + "\n" +
                "Take a guess.");
        Random rand = new Random();
        int r = rand.nextInt(20)+1;
        int count = 0;
        boolean ans = true;
        try {
            while (ans) {
                int input = sc.nextInt();
                while (input != r) {
                    if (input > r) {
                        System.out.println("Your guess is too high." + "\n" +
                                "Take a guess.");
                        count++;
                        input = sc.nextInt();
                    } else if (input < r) {
                        System.out.println("Your guess is too low." + "\n" +
                                "Take a guess.");
                        count++;
                        input = sc.nextInt();
                    }
                }
            }
            ans = false;
            System.out.println("Good job," + name + "! You guess my number in " + count + " guesses!" + "\n" +
                    "Would you like to play again? (y or n)");
            String end = sc.next();
            if (end.equals("y")) {
                ans = true;
                System.out.println("Take a guess");
            }
        }catch (Exception e) {
            System.out.println("INVALID ENTRY");


            }
        }
    }

