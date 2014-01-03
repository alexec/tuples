package tuples;

/**
 * Hello world!
 */
public class SimpleTuples {

    public static Object homogeneousPrimitiveTuple2() {
        return new IntTuple2(0, 1);
    }

    public static Object heterogeneousPrimitiveTuple2() {
        return new Tuple2<Integer,Boolean>(0, true);
    }

    public static Object heterogeneousBoxedTuple2() {
        return new Tuple2<Integer,String>(0, "");
    }

    public static Object heterogeneousObjectTuple2() {
        return new Tuple2<Class<?>,String>(SimpleTuples.class, "");
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
