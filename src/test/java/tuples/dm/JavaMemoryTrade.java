package tuples.dm;

/**
 * @author alex.collins
 */

class JavaMemoryTrade implements MemoryTrade {
    private long tradeId;
    private long clientId;
    private int venueCode;
    private int instrumentCode;
    private long price;
    private long quantity;
    private char side;

    @Override
    public long getTradeId() {
        return tradeId;
    }

    @Override
    public void setTradeId(final long tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public long getClientId() {
        return clientId;
    }

    @Override
    public void setClientId(final long clientId) {
        this.clientId = clientId;
    }

    @Override
    public int getVenueCode() {
        return venueCode;
    }

    @Override
    public void setVenueCode(final int venueCode) {
        this.venueCode = venueCode;
    }

    @Override
    public int getInstrumentCode() {
        return instrumentCode;
    }

    @Override
    public void setInstrumentCode(final int instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public void setPrice(final long price) {
        this.price = price;
    }

    @Override
    public long getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    @Override
    public char getSide() {
        return side;
    }

    @Override
    public void setSide(final char side) {
        this.side = side;
    }
}