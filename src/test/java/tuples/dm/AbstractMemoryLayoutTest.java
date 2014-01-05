package tuples.dm;

/**
 * @author alex.collins
 */
abstract class AbstractMemoryLayoutTest {
    static final int NUM_RECORDS = 500_000;
    int i = 0;

    public void perfRun() {

        final MemoryTrade trade = get(i);

        trade.getSide();
        trade.getPrice();
        trade.getQuantity();

        i = (i + 1) % NUM_RECORDS;
    }

    abstract MemoryTrade get(int i);

    static int pack(final byte[] value) {
        int result = 0;
        switch (value.length) {
            case 4:
                result = (value[3]);
            case 3:
                result |= ((int) value[2] << 8);
            case 2:
                result |= ((int) value[1] << 16);
            case 1:
                result |= ((int) value[0] << 24);
                break;

            default:
                throw new IllegalArgumentException("Invalid array size");
        }

        return result;
    }
}
