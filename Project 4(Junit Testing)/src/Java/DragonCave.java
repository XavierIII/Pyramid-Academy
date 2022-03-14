import java.util.Random;
import java.util.Scanner;
public class DragonCave {
    public int number = 1;


    public int getNumber() {
        return number;
    }

    public static void main(String[] args){

        System.out.println("You are in the land full of dragons. In front of you" +"\n"+
                "you see two caves. In one cave, the dragon is friendly" + "\n"+
                "and will share his treasure with you. The other dragon" +"\n"+
                "is greedy and hungry and will eat you on site." + "\n"+
                "which cave will you go into? (1 or 2)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Random rand = new Random();
        int r = rand.nextInt(1)+1;
    }

}

