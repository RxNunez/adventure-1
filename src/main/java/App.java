import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Guest on 8/3/17.
 */
public class App {
    public static void main(String[] args) {
        int choice;
        int timer=0;
        int defaultTimer = 4;
        int value;
        System.out.println("Welcome to our game!");
        System.out.println("what is your name?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Adventure newAdventure = new Adventure ();
        String[] questions = {"What do you do? Press 1 to take a quick shower or Press 2 to just leave the house because you don't stink that much.", "Finally outside, do you: Press 1 to wait for the bus or Press 2 to call a Lyft.", "Ohh no! Your vehicle got into an accident. Press 1 to steal a bike from a nearby child or Press 2 to walk the rest of the way"};

        try {
            String userName = bufferedReader.readLine();
            System.out.println("HOLY CRAP,"+userName+"! You're running late!");
            System.out.println("Your have just woken up and have stink of alcohol from last night.");

            for (String individualEntry : questions) {

                System.out.println(individualEntry);
                choice = Integer.parseInt(bufferedReader.readLine());
                choice = checkValidChoice(choice);
                value = newAdventure.getUserChoice(choice);
                timer = newAdventure.countDown(value, defaultTimer);
                defaultTimer=timer;
            }

             newAdventure.endGame(timer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int checkValidChoice(int choice) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (choice != 1 && choice != 2) {
            System.out.println("Please select a valid choice.");
            try {
                choice = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return choice;
    }
}
