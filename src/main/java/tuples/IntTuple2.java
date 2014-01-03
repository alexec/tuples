package tuples;

/**
 * @author alex.collins
 */
public class IntTuple2 {
    private final int _0;
    private final int _1;

    public IntTuple2(int t0, int t1) {
        _0 = t0;
        _1 = t1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntTuple2 intTuple2 = (IntTuple2) o;

        if (_0 != intTuple2._0) return false;
        if (_1 != intTuple2._1) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0;
        result = 31 * result + _1;
        return result;
    }

    @Override
    public String toString() {return "(" + _0 +','+_1+')';}
}
