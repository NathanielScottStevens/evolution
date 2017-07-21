package evolution;

import org.junit.Assert;
import org.junit.Test;

public class AgentTest {

    @Test
    public void movesRight() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(3, 2);

        agent.moveRight();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesLeft() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(1, 2);

        agent.moveLeft();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesUp() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(2, 3);

        agent.moveUp();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesDown() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(2, 1);

        agent.moveDown();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesUpLeft() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(1, 3);

        agent.moveUpLeft();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesUpRight() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(3, 3);

        agent.moveUpRight();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesDownLeft() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(1, 1);

        agent.moveDownLeft();

        Assert.assertEquals(agent.getPosition(), expected);
    }

    @Test
    public void movesDownRight() {
        Agent agent = new Agent('c', new Point(2, 2));
        Point expected = new Point(3, 1);

        agent.moveDownRight();

        Assert.assertEquals(agent.getPosition(), expected);
    }
}


