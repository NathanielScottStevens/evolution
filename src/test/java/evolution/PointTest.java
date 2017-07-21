package evolution;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void add(){
        Point point = new Point(1, 1);

        Point expected = new Point(2, 2);
        Point actual = point.add(1, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPoint(){
        Point point = new Point(1, 1);

        Point expected = new Point(2, 2);
        Point actual = point.add(new Point(1, 1));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sub(){
        Point point = new Point(3, 3);

        Point expected = new Point(2, 2);
        Point actual = point.sub(1, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subPoint() {
        Point point = new Point(3, 3);

        Point expected = new Point(2, 2);
        Point actual = point.sub(new Point(1, 1));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mult(){
        Point point = new Point(2, 2);

        Point expected = new Point(4, 4);
        Point actual = point.mult(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void div(){
        Point point = new Point(4, 4);

        Point expected = new Point(2, 2);
        Point actual = point.div(2);

        Assert.assertEquals(expected, actual);
    }
}

