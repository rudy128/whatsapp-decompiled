package X;

/* renamed from: X.0IL  reason: invalid class name */
public final class AnonymousClass0IL {
    public long A00 = AnonymousClass0QY.A03;
    public final long A01;
    public final long A02;

    public AnonymousClass0IL(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HistoricalChange(uptimeMillis=");
        A10.append(this.A02);
        A10.append(", position=");
        return AnonymousClass001.A1F(AnonymousClass0QY.A06(this.A01), A10);
    }
}
