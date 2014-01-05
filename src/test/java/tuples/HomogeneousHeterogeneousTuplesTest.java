package tuples;

import org.junit.Test;

/**
 * @author alex.collins
 */
public class HomogeneousHeterogeneousTuplesTest {

    @Test
    public void test() throws Exception {

        int[] intOnlyTuple = {0, 1};
        Integer[] integerOnlyTuple = {0, 1};

        Object[] heteroTuple = {"", Integer.class};

        String _0 = (String) heteroTuple[0];
        @SuppressWarnings("unchecked")
        Class<Integer> _1 = (Class<Integer>) heteroTuple[0];

    }
}
