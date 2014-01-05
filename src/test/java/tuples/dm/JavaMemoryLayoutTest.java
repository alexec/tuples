package tuples.dm;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;

/**
 * @author alex.collins
 */
@State(Scope.Benchmark)
public class JavaMemoryLayoutTest extends AbstractMemoryLayoutTest {

    private MemoryTrade[] trades;

    @Override
    @GenerateMicroBenchmark
    public void perfRun() {
        super.perfRun();
    }

    public static void main(String[] args) {
        Main.main(new String[]{"tuples.dm.JavaMemoryLayoutTest.perfRun"});
    }

    @Override
    MemoryTrade get(final int index) {
        return trades[index];
    }

    @Setup
    public void init() {
        trades = new MemoryTrade[NUM_RECORDS];

        final int venueCode = pack(new byte[]{'X', 'L', 'O', 'N'});

        final int instrumentCode = pack(new byte[]{'B', 'H', 'P'});

        for (int i = 0; i < NUM_RECORDS; i++) {
            MemoryTrade trade = new JavaMemoryTrade();

            trade.setTradeId(i);
            trade.setClientId(1);
            trade.setVenueCode(venueCode);
            trade.setInstrumentCode(instrumentCode);
            trade.setPrice(i);
            trade.setQuantity(i);
            trade.setSide((i & 1) == 0 ? 'B' : 'S');

            trades[i] = trade;
        }
    }

    @TearDown
    public void tearDown() throws Exception {
        trades = null;
    }
}
