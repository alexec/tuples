package tuples;

import java.util.Arrays;

/**
 * @author alex.collins
 */
public class ObjectTupleN {
    private final Object[] values;

    public ObjectTupleN(Object... values) {
        this.values = values;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectTupleN that = (ObjectTupleN) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(values, that.values)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }

    @Override
    public String toString() {return Arrays.toString(values);}
}
