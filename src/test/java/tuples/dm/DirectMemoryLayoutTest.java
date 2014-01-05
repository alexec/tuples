package tuples.dm;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

@State(Scope.Benchmark)
public class DirectMemoryLayoutTest extends AbstractMemoryLayoutTest {
    private static final Unsafe unsafe = getUnsafe();

    static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @GenerateMicroBenchmark
    public void perfRun() {
        super.perfRun();
    }

    private static long address;
    private static final DirectMemoryTrade flyweight = new DirectMemoryTrade(unsafe);

    @Override
    MemoryTrade get(final int index) {
        flyweight.objectOffset = address + (index * DirectMemoryTrade.objectSize);
        return flyweight;
    }

    @Override
    @Setup
    public void init() {
        final long requiredHeap = NUM_RECORDS * DirectMemoryTrade.objectSize;
        address = unsafe.allocateMemory(requiredHeap);

        final byte[] londonStockExchange = {'X', 'L', 'O', 'N'};
        final int venueCode = pack(londonStockExchange);

        final byte[] billiton = {'B', 'H', 'P'};
        final int instrumentCode = pack(billiton);

        for (int i = 0; i < NUM_RECORDS; i++) {
            MemoryTrade trade = get(i);

            trade.setTradeId(i);
            trade.setClientId(1);
            trade.setVenueCode(venueCode);
            trade.setInstrumentCode(instrumentCode);

            trade.setPrice(i);
            trade.setQuantity(i);

            trade.setSide((i & 1) == 0 ? 'B' : 'S');
        }
    }

    private static void destroy() {
        unsafe.freeMemory(address);
    }
}
