package za.ac.cput.istrue;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestIsTrue extends TestCase {
    public void testTruth() throws Exception{
        IsTrue it = new IsTrue();

        Assert.assertTrue("Is it true", 4 < 8);
    }
}
