import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int b = this.getLocalNumber();
        {
            if (b == 12) {
                System.out.println("GetLocalNumber return 12");
            } else {
                System.out.println("GetLocalNumber return not 12");
            }
        }

    }

}
