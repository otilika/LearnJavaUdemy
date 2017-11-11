import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    @Test
    public void testFeetAndInchesConvert() {
        Assert.assertEquals((double)((12*1 + 12) * 2.54), Convert.calculate(1, 12), 0);
        Assert.assertTrue(Convert.calculate(0, 0) != -1); //valid values
        Assert.assertTrue(Convert.calculate(-1, 0) == -1); //invalid feet value
        Assert.assertTrue(Convert.calculate(0, -1) == -1); //invalid inch value
        Assert.assertTrue(Convert.calculate(1, 1) != -1); //valid values
        Assert.assertTrue(Convert.calculate(1, 13) == -1); //invalid inch value
    }
    
    @Test
    public void testInchesConvert(){
        Assert.assertEquals(13*2.54, Convert.calculate(13),0); //invalid inch value
    }
}
