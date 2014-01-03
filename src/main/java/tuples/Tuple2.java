package tuples;

/**
 * @author alex.collins
 */
public class Tuple2<T0,T1> {
    private final T0 _0;
    private final T1 _1;

    public Tuple2(T0 t0, T1 t1) {
        _0 = t0;
        _1 = t1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple2 tuple2 = (Tuple2) o;

        if (_0 != null ? !_0.equals(tuple2._0) : tuple2._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple2._1) : tuple2._1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0 != null ? _0.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {return "(" + _0 +','+_1+')';}
}
