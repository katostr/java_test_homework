package pack.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testArea1() {
Point p1 = new Point(5,7);
Point p2 = new Point(1,3);
assert p1.distance(p2) == 5.656854249492381;
    }

    @Test
    public void testArea2() {
        Point p1 = new Point(5,7);
        Point p2 = new Point(1,3);
        Assert.assertEquals(p1.distance(p2),5.656854249492381);
    }
    }

