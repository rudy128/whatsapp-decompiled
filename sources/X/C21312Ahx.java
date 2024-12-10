package X;

/* renamed from: X.Ahx  reason: case insensitive filesystem */
public final class C21312Ahx implements C22485B9r {
    public final long A00;
    public final long A01;
    public final long A02;

    public C21312Ahx(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public C201110w BDY() {
        C201210x builder = C201110w.builder();
        builder.put("startTimeEpochMillis", String.valueOf(this.A02));
        builder.put("endTimeEpochMillis", String.valueOf(this.A01));
        builder.put("clientTimeInEpochMillis", String.valueOf(this.A00));
        C201110w build = builder.build();
        C18070vi.A0X(build);
        return build;
    }
}
