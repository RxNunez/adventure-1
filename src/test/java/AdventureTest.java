import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AdventureTest {


    @Test
    public void getUserChoice_whenChoiceIs1_1 () {
        Adventure testAdventure = new Adventure();
        assertEquals(1, testAdventure.getUserChoice(1));
    }

    @Test
    public void getUserChoice_whenChoiceIs2_3 () {
        Adventure testAdventure = new Adventure();
        assertEquals(3, testAdventure.getUserChoice(2));
    }

    @Test
    public void countDown_subtractTime_9 () {
        Adventure testAdventure = new Adventure();
        assertEquals(9, testAdventure.countDown(1,10));
    }

    @Test
    public void countDown_subtractTime_7 () {
        Adventure testAdventure = new Adventure();
        assertEquals(7, testAdventure.countDown(3,10));
    }

    @Test
    public void endGame_whenLose_loser () {
        Adventure testAdventure = new Adventure();
        assertEquals("You lose!", testAdventure.endGame(-1));
    }

    @Test
    public void endGame_whenWinner_winner () {
        Adventure testAdventure = new Adventure();
        assertEquals("You win!", testAdventure.endGame(0));
    }

}