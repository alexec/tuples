package tuples;

/**
 * @author alex.collins
 */
public final class Tuple3<T0, T1, T2> implements Tuple<Tuple3<T0, T1, T2>> {
    public final T0 _0;
    public final T1 _1;
    public final T2 _2;

    protected Tuple3(T0 _0, T1 _1, T2 _2) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
    }

    public static <T0, T1, T2> Tuple3<T0, T1, T2> valueOf(T0 _0, T1 _1, T2 _2) {
        return new Tuple3<>(_0, _1, _2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple3 tuple3 = (Tuple3) o;

        if (_0 != null ? !_0.equals(tuple3._0) : tuple3._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple3._1) : tuple3._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple3._2) : tuple3._2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0 != null ? _0.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" + _0 + ',' + _1 + ',' + _2 + ')';
    }

    @Override
    public Object apply(int value) {
        switch (value) {
            case 0:
                return _0;
            case 1:
                return _1;
            case 2:
                return _2;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return 3;
    }
}
