package tuples;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.IntFunction;

/**
 * @author alex.collins
 */
public interface Tuple<T extends Tuple> extends IntFunction, Serializable, Cloneable, Comparable<T> {

    public static Tuple0 valueOf() {
        return Tuple0.valueOf();
    }

    public static <T0> Tuple1<T0> valueOf(T0 _0) {
        return Tuple1.valueOf(_0);
    }

    public static <T0, T1> Tuple2<T0, T1> valueOf(T0 _0, T1 _1) {
        return Tuple2.valueOf(_0, _1);
    }

    public static <T0, T1, T2> Tuple3<T0, T1, T2> valueOf(T0 _0, T1 _1, T2 _2) {
        return Tuple3.valueOf(_0, _1, _2);
    }

    int size();

    @Override
    default int compareTo(T o) {
        Objects.requireNonNull(o);
        if (!getClass().equals(o.getClass())) {
            throw new ClassCastException(o.getClass() + " must equal " + getClass());
        }

        for (int i = 0; i < size(); i++) {
            @SuppressWarnings("unchecked")
            Comparable<Object> l = (Comparable<Object>) apply(i);
            Object r = o.apply(i);
            int c = l.compareTo(r);
            if (c != 0) {
                return c;
            }
        }

        return 0;
    }
}
