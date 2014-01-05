package mechsym;

/**
 * @author alex.collins
 */

class JavaMemoryTrade {
    private long tradeId;
    private long clientId;
    private int venueCode;
    private int instrumentCode;
    private long price;
    private long quantity;
    private char side;


    public long getTradeId() {
        return tradeId;
    }


    public void setTradeId(final long tradeId) {
        this.tradeId = tradeId;
    }


    public long getClientId() {
        return clientId;
    }


    public void setClientId(final long clientId) {
        this.clientId = clientId;
    }


    public int getVenueCode() {
        return venueCode;
    }


    public void setVenueCode(final int venueCode) {
        this.venueCode = venueCode;
    }


    public int getInstrumentCode() {
        return instrumentCode;
    }


    public void setInstrumentCode(final int instrumentCode) {
        this.instrumentCode = instrumentCode;
    }


    public long getPrice() {
        return price;
    }


    public void setPrice(final long price) {
        this.price = price;
    }


    public long getQuantity() {
        return quantity;
    }


    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }


    public char getSide() {
        return side;
    }


    public void setSide(final char side) {
        this.side = side;
    }
}