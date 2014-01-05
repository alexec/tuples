package mechsym;

import sun.misc.Unsafe;

/**
 * @author alex.collins
 */
class DirectMemoryTrade {
    private static long offset = 0;

    private static final long tradeIdOffset = offset += 0;
    private static final long clientIdOffset = offset += 8;
    private static final long venueCodeOffset = offset += 8;
    private static final long instrumentCodeOffset = offset += 4;
    private static final long priceOffset = offset += 4;
    private static final long quantityOffset = offset += 8;
    private static final long sideOffset = offset += 8;

    static final long OBJECT_SIZE = offset += 2;

    private final Unsafe unsafe;
    long objectOffset;

    DirectMemoryTrade(Unsafe unsafe) {
        this.unsafe = unsafe;
    }

    public long getTradeId() {
        return unsafe.getLong(objectOffset + tradeIdOffset);
    }

    public void setTradeId(final long tradeId) {
        unsafe.putLong(objectOffset + tradeIdOffset, tradeId);
    }

    public long getClientId() {
        return unsafe.getLong(objectOffset + clientIdOffset);
    }

    public void setClientId(final long clientId) {
        unsafe.putLong(objectOffset + clientIdOffset, clientId);
    }

    public int getVenueCode() {
        return unsafe.getInt(objectOffset + venueCodeOffset);
    }

    public void setVenueCode(final int venueCode) {
        unsafe.putInt(objectOffset + venueCodeOffset, venueCode);
    }

    public int getInstrumentCode() {
        return unsafe.getInt(objectOffset + instrumentCodeOffset);
    }

    public void setInstrumentCode(final int instrumentCode) {
        unsafe.putInt(objectOffset + instrumentCodeOffset, instrumentCode);
    }

    public long getPrice() {
        return unsafe.getLong(objectOffset + priceOffset);
    }

    public void setPrice(final long price) {
        unsafe.putLong(objectOffset + priceOffset, price);
    }

    public long getQuantity() {
        return unsafe.getLong(objectOffset + quantityOffset);
    }

    public void setQuantity(final long quantity) {
        unsafe.putLong(objectOffset + quantityOffset, quantity);
    }

    public char getSide() {
        return unsafe.getChar(objectOffset + sideOffset);
    }

    public void setSide(final char side) {
        unsafe.putChar(objectOffset + sideOffset, side);
    }
}
