package testing;

import eu.ase.polimorphism.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ranges.RangeException;

public class JUnitEvalutation {
    @Test
    public void testAutoSetDoorsNoLt0 () throws Exception {
        Auto auto = new Auto();
        try {
            auto.setDoorsNo(-5);
            Assert.fail("setDoorsNo accepts negative values !");
        } catch (Exception e) {
            // OK!
        }
    }
    @Test
    public void testSetDoorsNof() {
        Auto auto = new Auto();
        try {
            auto.setDoorsNo(4);
            Assert.assertEquals(4, auto.getDoorsNo());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

    }
}
