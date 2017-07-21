package evolution;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class WorldTest {

    @Test
    public void isPositionOpenReturnsTrueInBounds(){
        World world = new World(4,4);
        boolean actual = world.isPositionOpen(new Point(2, 2));
        Assert.assertTrue(actual);
    }

    @Test
    public void isPositionOpenReturnsFalseOutOfBounds(){
        World world = new World(4, 4);

        Assert.assertFalse(world.isPositionOpen(new Point(-1, -1)));
        Assert.assertFalse(world.isPositionOpen(new Point(4, 0)));
        Assert.assertFalse(world.isPositionOpen(new Point(4, 4)));
        Assert.assertFalse(world.isPositionOpen(new Point(0, 4)));
    }

    @Test
    public void CallsAgentUpdate(){
        World world = new World(4, 4);

        Agent agent = mock(Agent.class);
        when(agent.getPosition()).thenReturn(new Point(1, 1));
        when(agent.getCharacter()).thenReturn('c');

        world.addAgent(agent);
        world.update();

        verify(agent).update(world);
    }

    @Test
    public void UpdatesAgentPosition() {
        World world = new World(4, 4);

        Agent agent = mock(Agent.class);
        when(agent.getPosition()).thenReturn(new Point(1, 1));
        when(agent.getCharacter()).thenReturn('c');

        world.addAgent(agent);
        world.update();

        Assert.assertEquals('c', world.getChar(new Point(1, 1)));
    }

    @Test
    public void ClearsOldPositionOfAgentOnceMoved(){
        World world = new World(4, 4);

        Agent agent = mock(Agent.class);
        when(agent.getPosition()).thenReturn(new Point(1, 1));
        when(agent.getCharacter()).thenReturn('c');

        world.addAgent(agent);
        world.update();

        when(agent.getPosition()).thenReturn(new Point(1, 2));
        world.update();

        Assert.assertEquals('.', world.getChar(new Point(1, 1)));
    }
}
