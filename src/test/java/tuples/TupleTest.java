package tuples;

import org.junit.Test;


/**
 * @author alex.collins
 */
public class TupleTest {

    @Test
    public void testName() throws Exception {

        Tuple2<? extends Number, Boolean> t = Tuple.valueOf(0, false);

        t = Tuple.valueOf(0f, true);

        Tuple2<Integer, Boolean> a = Tuple.valueOf(0, false);
        Tuple2<? extends Number, Boolean> b = a;


        Tuple2<Object, Object> z = Tuple.valueOf(null, null);

        Object t0 = z.apply(0);

        Tuple m = Tuple.valueOf(0, false);

        Object t1 = z.apply(0);

        Tuple2<Integer, Boolean> x = Tuple.valueOf(0, false);
        Tuple3<Integer, Float, Boolean> y = Tuple.valueOf(0, 0f, false);

    }
}
