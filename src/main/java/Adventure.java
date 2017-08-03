/**
 * Created by Guest on 8/3/17.
 */
public class Adventure {

    public int timer;
    private int userChoice;
    private int value;
    private int newTimerValue;
    private int timerValue;


    public int getUserChoice(int userChoice) {

        switch (userChoice){
            case 1: value = 1;
                    System.out.println(value);
                    break;
            case 2: value = 3;
                    System.out.println(value);
                    break;
            default:
                System.out.println("invalid input. Please select only 1 or 2");

        }
        return value;
    }

    public int countDown(int value, int timerValue) {
        newTimerValue = timerValue-value;
        return newTimerValue;
    }

    public String endGame(int countDownValue) {
        if (countDownValue < 0) {
            String loser = "You lose!";
            System.out.println(loser + " " + countDownValue);
            return loser;
        } else {
            String winner = "You win!";
            System.out.println(winner + " " + countDownValue);
            return winner;
        }
    }

}
