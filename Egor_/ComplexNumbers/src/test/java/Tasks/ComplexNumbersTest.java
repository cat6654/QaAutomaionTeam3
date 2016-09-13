package Tasks;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Egor on 13.09.2016.
 */
@RunWith(Parameterized.class)
public class ComplexNumbersTest extends TestCase {

    private ComplexNumbers c1;
    private ComplexNumbers c2;
    private boolean res;

    public ComplexNumbersTest(ComplexNumbers c, boolean b)
    {
        c1 = new ComplexNumbers(5,6);
        c2 = c;
        res = b;
    }

    @Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]
                {
                        {null, false},
                        {new ComplexNumbers(5,6), true},
                        {new ComplexNumbers(-3,4), false}
                });
    }

    @Test
    public void testEquals()
    {
        assertEquals(res, c1.equals(c2));
    }

    @Test
    public void testAdd()
    {
        assertEquals(true, new ComplexNumbers(2,10).equals(c1.add(new ComplexNumbers(-3,4))));
    }

    @Test
    public void testSubtract()
    {
        assertEquals(true, new ComplexNumbers(8,2).equals(c1.subtract(new ComplexNumbers(-3,4))));
    }

    @Test
    public void testMultiply()
    {
        assertEquals(true, new ComplexNumbers(-39,2).equals(c1.multiply(new ComplexNumbers(-3,4))));
        assertEquals(true, new ComplexNumbers(-39,2).equals(new ComplexNumbers(-3,4).multiply(c1)));
    }

    @Test
    public void testDivide()
    {
        assertEquals(true, new ComplexNumbers(0.36,-1.52).equals(c1.divide(new ComplexNumbers(-3,4))));
    }

}