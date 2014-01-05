package tuples;

/**
 * @author alex.collins
 */
public final class Tuple4<T0, T1, T2, T3> implements Tuple<Tuple4<T0, T1, T2, T3>> {


    private static final long serialVersionUID = -3504712846387908856L;
    public final T0 _0;
    public final T1 _1;
    public final T2 _2;
    public final T3 _3;

    protected Tuple4(T0 _0, T1 _1, T2 _2, T3 _3) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static <T0, T1, T2, T3> Tuple4<T0, T1, T2, T3> valueOf(T0 _0, T1 _1, T2 _2, T3 _3) {
        return new Tuple4<>(_0, _1, _2, _3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple4 tuple4 = (Tuple4) o;

        if (_0 != null ? !_0.equals(tuple4._0) : tuple4._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple4._1) : tuple4._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple4._2) : tuple4._2 != null) return false;
        if (_3 != null ? !_3.equals(tuple4._3) : tuple4._3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0 != null ? _0.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        result = 31 * result + (_3 != null ? _3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" + _0 + ',' + _1 + ',' + _2 + ',' + _3 + ')';
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
            case 3:
                return _3;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return 4;
    }
}
