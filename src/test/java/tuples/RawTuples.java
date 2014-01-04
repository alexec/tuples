package tuples;

/**
 * Hello world!
 */
public class RawTuples {

    public static Object homogeneousPrimitiveTuple2() {
        return new int[]{0, 1};
    }

    public static Object heterogeneousPrimitiveTuple2() {
        return new Object[]{0, true};
    }

    public static Object heterogeneousBoxedTuple2() {
        return new Object[]{new Integer(0), ""};
    }

    public static Object heterogeneousObjectTuple2() {
        return new Object[]{RawTuples.class, ""};
    }

    public static Object[] tuples() {
        return new Object[]{
                homogeneousPrimitiveTuple2(),
                heterogeneousPrimitiveTuple2(),
                heterogeneousBoxedTuple2(),
                heterogeneousObjectTuple2()
        };
    }
}
