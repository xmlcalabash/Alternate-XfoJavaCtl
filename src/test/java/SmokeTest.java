import jp.co.antenna.XfoJavaCtl.XfoException;
import jp.co.antenna.XfoJavaCtl.XfoObj;
import junit.framework.TestCase;

public class SmokeTest extends TestCase {
    public void testInstantiation() {
        try {
            XfoObj ah = new XfoObj();
            assertNotNull(ah);
        } catch (XfoException ex) {
            fail();
        }
    }
}
