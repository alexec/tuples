package tuples;

/**
 * @author alex.collins
 */
public final class Tuple0 implements Tuple<Tuple0> {
    private static final Tuple0 INSTANCE = new Tuple0();

    protected Tuple0() {
    }

    @Override
    public String toString() {
        return "()";
    }

    public static Tuple0 valueOf() {
        return INSTANCE;
    }

    @Override
    public Object apply(int value) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return 0;
    }
}
