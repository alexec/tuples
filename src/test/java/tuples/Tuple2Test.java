package tuples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author alex.collins
 */
public class Tuple2Test {

    Tuple2<Integer, Boolean> x = new Tuple2<>(0, false);
    Tuple2<Integer, Boolean> y = new Tuple2<>(0, true);
    Tuple2<Integer, Boolean> z = new Tuple2<>(1, false);

    @Test
    public void testComparability() throws Exception {
        assertEquals(0, x.compareTo(x));
        assertEquals(-1, x.compareTo(y));
        assertEquals(1, y.compareTo(x));
        assertEquals(-1, y.compareTo(z));
    }
}
