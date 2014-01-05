package tuples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author alex.collins
 */
public final class Tuple0 implements Tuple<Tuple0> {

    private static final Tuple0 INSTANCE = new Tuple0();
    private static final long serialVersionUID = 1015700180699730675L;

    protected Tuple0() {
    }

    public static Tuple0 valueOf() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "()";
    }

    @Override
    public Object apply(int value) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return 0;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
    }
}
