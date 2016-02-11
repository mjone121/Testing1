package P1;

import static org.junit.Assert.*;

/**
 * Created by mjone121 on 2/2/2016.
 */
public class LucksTest {

    @org.junit.Test
    public void testMain1() throws Exception {
        int result = Lucks.biggest(4,3);
        assertEquals("Test failed with the first number biggest", 4, result);
    }

    @org.junit.Test
    public void testMain2() throws Exception {
        int result = Lucks.biggest(3,4);
        assertEquals("Test failed with the first number biggest", 4, result);
    }

    @org.junit.Test
    public void testMain3() throws Exception {
        int result = Lucks.biggest(4, 4);
        assertEquals("Test failed with the first number biggest", 4, result);
    }
}