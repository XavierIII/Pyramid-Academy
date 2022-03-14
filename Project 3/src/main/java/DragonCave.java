import java.util.Random;
import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(1) + 1;
        System.out.println("You are in the land full of dragons. In front of you" +
                "\n" + "you see two caves. In one cave, the dragon is friendly" + "\n"
                + "and will share his treasure with you. The other dragon" + "\n" +
                "is greedy and hungry and will eat you on site." + "\n" +
                "which cave will you go into? (1 or 2)");
        try {
            int input = sc.nextInt();
            if (input == r)
                System.out.println("You approach the cave..\nIt is dark and spooky...\nA large dragon jumps out in front of you! he opens his jaws and ...\nGobbles you down in one bite!");
            else
                System.out.println("Invalid");
            } catch (Exception e) {
            System.out.println("Enter either 1 or 2");
        }
    }
}
