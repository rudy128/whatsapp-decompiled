package X;

/* renamed from: X.0OE  reason: invalid class name */
public final class AnonymousClass0OE {
    public final float A00;
    public final float A01;
    public final C28644ECa A02;

    public static final double A00(AnonymousClass0OE r5, float f) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (r5.A00 * r5.A01)));
    }

    public AnonymousClass0OE(C28644ECa eCa, float f) {
        this.A00 = f;
        this.A02 = eCa;
        this.A01 = A01(eCa);
    }

    public static final float A01(C28644ECa eCa) {
        float BQU = eCa.BQU();
        float f = C02870Fs.A00;
        return BQU * 386.0878f * 160.0f * 0.84f;
    }
}
