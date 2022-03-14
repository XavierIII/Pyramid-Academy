import java.util.*;

public class DragonCave {
    public static void main(String [] args){

        System.out.println("You are in the land full of dragons. In front of you" +"\n"+
                "you see two caves. In one cave, the dragon is friendly" + "\n"+
                "and will share his treasure with you. The other dragon" +"\n"+
                "is greedy and hungry and will eat you on site." + "\n"+
                "which cave will you go into? (1 or 2)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Random rand = new Random();
        int r = rand.nextInt(1)+1;
        if(input == r)
            System.out.println("You approach the cave.." + "\n" +
                    "It is dark and spooky..." +"\n" +
                    "A large dragon jumps out in front of you! he opens his jaws and ..." +"\n"+
                    "Gobbles you down in one bite!");

    }
}
