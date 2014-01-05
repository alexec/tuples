package tuples.dm;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * @author alex.collins
 */
@State(Scope.Benchmark)
public class JavaMemoryLayoutTest extends AbstractMemoryLayoutTest {

    private static MemoryTrade[] trades;

    @Override
    @GenerateMicroBenchmark
    public void perfRun() {
        super.perfRun();
    }

    @Override
    MemoryTrade get(final int index) {
        return trades[index];
    }

    @Override
    @Setup
    public void init() {
        trades = new MemoryTrade[NUM_RECORDS];

        final byte[] londonStockExchange = {'X', 'L', 'O', 'N'};
        final int venueCode = pack(londonStockExchange);

        final byte[] billiton = {'B', 'H', 'P'};
        final int instrumentCode = pack(billiton);

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

}
