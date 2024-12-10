package X;

/* renamed from: X.Ahw  reason: case insensitive filesystem */
public final class C21311Ahw implements C22485B9r {
    public Long A00;
    public Long A01;
    public final AnonymousClass9ZK A02;

    public C21311Ahw(AnonymousClass9ZK r1) {
        this.A02 = r1;
    }

    public C201110w BDY() {
        C201210x builder = C201110w.builder();
        C188729ht r7 = this.A02.A00;
        long j = r7.A00;
        builder.put("currentTimeEpochMillis", String.valueOf(j));
        Long l = this.A00;
        if (l != null) {
            builder.put("lastImpressionEpochMillis", String.valueOf(l.longValue()));
            builder.put("minImpressionDelayMillis", String.valueOf(r7.A01));
        }
        Long l2 = this.A01;
        if (l2 != null) {
            builder.put("impressionDeltaMillis", String.valueOf(j - l2.longValue()));
        }
        C201110w build = builder.build();
        C18070vi.A0X(build);
        return build;
    }
}
