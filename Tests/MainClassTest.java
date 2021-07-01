import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("GetLocalNumber return not 12",getLocalNumber() == 12);
    }

}
