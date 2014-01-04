package tuples;


/**
 * Hello world!
 */
public class SimpleTuples {

    public static Object heterogeneousPrimitiveTuple2() {
        return Tuple.valueOf(0, true);
    }

    public static Object heterogeneousBoxedTuple2() {
        return Tuple.valueOf(0, "");
    }

    public static Object heterogeneousObjectTuple2() {
        return Tuple.valueOf(SimpleTuples.class, "");
    }

    public static Object[] tuples() {
        return new Object[]{
                heterogeneousPrimitiveTuple2(),
                heterogeneousBoxedTuple2(),
                heterogeneousObjectTuple2()
        };
    }
}
