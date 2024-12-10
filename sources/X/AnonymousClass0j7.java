package X;

/* renamed from: X.0j7  reason: invalid class name */
public final class AnonymousClass0j7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0KK $enter;
    public final /* synthetic */ AnonymousClass0KL $exit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0j7(AnonymousClass0KK r2, AnonymousClass0KL r3) {
        super(1);
        this.$enter = r2;
        this.$exit = r3;
    }

    /* renamed from: A00 */
    public final Float invoke(AnonymousClass0CL r4) {
        AnonymousClass0OX r0;
        int ordinal = r4.ordinal();
        float f = 1.0f;
        if (ordinal != 1) {
            if (ordinal == 0) {
                r0 = ((AnonymousClass072) this.$enter).A00;
            } else if (ordinal == 2) {
                r0 = ((AnonymousClass073) this.$exit).A00;
            } else {
                throw new AnonymousClass3EW();
            }
            if (r0.A00 != null) {
                f = 0.0f;
            }
        }
        return Float.valueOf(f);
    }
}
