package X;

/* renamed from: X.Ahy  reason: case insensitive filesystem */
public final class C21313Ahy implements C22485B9r {
    public C185239cG A00;
    public C185239cG A01;
    public C185239cG A02;
    public C185239cG A03;

    public C201110w BDY() {
        C201210x builder = C201110w.builder();
        C185239cG r2 = this.A01;
        if (r2 != null) {
            builder.put("impressionCount", String.valueOf(r2.A00));
            builder.put("impressionLimit", String.valueOf(r2.A01));
        }
        C185239cG r22 = this.A02;
        if (r22 != null) {
            builder.put("primaryActionCount", String.valueOf(r22.A00));
            builder.put("primaryActionLimit", String.valueOf(r22.A01));
        }
        C185239cG r23 = this.A03;
        if (r23 != null) {
            builder.put("secondaryActionCount", String.valueOf(r23.A00));
            builder.put("secondaryActionLimit", String.valueOf(r23.A01));
        }
        C185239cG r24 = this.A00;
        if (r24 != null) {
            builder.put("dismissActionCount", String.valueOf(r24.A00));
            builder.put("dismissActionLimit", String.valueOf(r24.A01));
        }
        C201110w build = builder.build();
        C18070vi.A0X(build);
        return build;
    }
}
