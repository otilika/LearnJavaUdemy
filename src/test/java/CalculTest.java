import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    @Test
    public void testConverter() {
        Assert.assertEquals((double)((12*1 + 12) * 2.54), Main.calculate(1, 12), 0);
        Assert.assertTrue(Main.calculate(0, 0) != -1); //valid values
        Assert.assertTrue(Main.calculate(-1, 0) == -1); //invalid feet value
        Assert.assertTrue(Main.calculate(0, -1) == -1); //invalid inch value
        Assert.assertTrue(Main.calculate(1, 1) != -1); //valid values
        Assert.assertTrue(Main.calculate(1, 13) == -1); //invalid inch value
        Assert.assertEquals(13*2.54, Main.calculate(13),0); //invalid inch value
    }
}
