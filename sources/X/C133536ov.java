package X;

/* renamed from: X.6ov  reason: invalid class name and case insensitive filesystem */
public abstract class C133536ov {
    public float A00 = 1.0f;
    public boolean A01;

    public void A01() {
        this.A01 = false;
        this.A00 = 1.0f;
    }

    public final float A00() {
        if (this.A01) {
            return (Math.abs(this.A00) / 4.0f) + 0.75f;
        }
        return 1.0f;
    }
}
