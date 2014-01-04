package tuples;

/**
 * @author alex.collins
 */
public final class Tuple2<T0, T1> implements Tuple<Tuple2<T0, T1>> {
    public final T0 _0;
    public final T1 _1;

    protected Tuple2(T0 _0, T1 _1) {
        this._0 = _0;
        this._1 = _1;
    }

    public static <T0, T1> Tuple2<T0, T1> valueOf(T0 _0, T1 _1) {
        return new Tuple2<>(_0, _1);
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
    public String toString() {
        return "(" + _0 + ',' + _1 + ')';
    }

    @Override
    public Object apply(int value) {
        switch (value) {
            case 0:
                return _0;
            case 1:
                return _1;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int compareTo(Tuple2<T0, T1> o) {
        int i = ((Comparable<T0>)_0).compareTo(o._0);
        if (i != 0) {return i;}
        return ((Comparable<T1>)_1).compareTo(o._1);
    }
}
