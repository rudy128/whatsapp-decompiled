package X;

/* renamed from: X.Bnk  reason: case insensitive filesystem */
public final class C23677Bnk extends C25776Cln {
    public final float A00;

    public boolean A00(float f, float f2, float f3) {
        if (C108945cZ.A00(f2, this.A01) <= f && C108945cZ.A00(f3, this.A00) <= f) {
            float f4 = this.A00;
            float A002 = C108945cZ.A00(f, f4);
            if (A002 <= 1.0f || A002 <= f4) {
                return true;
            }
        }
        return false;
    }

    public C23677Bnk(float f, float f2, float f3) {
        super(f, f2);
        this.A00 = f3;
    }
}
