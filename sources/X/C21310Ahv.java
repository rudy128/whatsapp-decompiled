package X;

/* renamed from: X.Ahv  reason: case insensitive filesystem */
public final class C21310Ahv implements C22485B9r {
    public final long A00;
    public final long A01;

    public C21310Ahv(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public C201110w BDY() {
        C201210x builder = C201110w.builder();
        long j = this.A01;
        builder.put("ttlInMillis", String.valueOf(j));
        long j2 = this.A00;
        builder.put("clientTimeInEpochMillis", String.valueOf(j2));
        builder.put("fetchTimeInEpochMillis", String.valueOf(0));
        builder.put("deltaSinceFetchInMillis", String.valueOf(j2 - j));
        C201110w build = builder.build();
        C18070vi.A0X(build);
        return build;
    }
}
