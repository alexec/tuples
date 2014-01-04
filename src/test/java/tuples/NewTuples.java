package tuples;


/**
 * @author alex.collins
 */
public class NewTuples {
    public static Tuple2<? extends Integer, Integer> homogeneousPrimitiveTuple2() {
        return Tuple.valueOf(0, 1);
    }

    public void test() {
        // NOT available
        final int x;
        int y;
        final int z, w;


        /*
        // VARIABLES
        // create new int x and y
        @Tuple (x, y) = homogeneousPrimitiveTuple2();
        // -> Tuple<...> $t = ...;
        // int x=$0._0;
        // int y=$t._1;

        // re-assign x and y
        (x, y) = homogeneousPrimitiveTuple2();
        // x and y with types
        (int x, int y) = homogeneousPrimitiveTuple2(); // error!!!

        (final x, final y) = homogeneousPrimitiveTuple2();
        (final int x, final int y) = homogeneousPrimitiveTuple2();
        (final int x, int y) = homogeneousPrimitiveTuple2();

        // STREAMS
        asList(valueOf(0, 0)).stream().map(t -> t._0);

        // FIELDS
        private Tuple2<Integer,Integer> valueOf;

        (private int x, float x) = homogeneousPrimitiveTuple2();
        */

    }
}
