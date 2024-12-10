package X;

/* renamed from: X.Cln  reason: case insensitive filesystem */
public abstract class C25776Cln {
    public final float A00;
    public final float A01;

    public static float A00(C25776Cln cln, C25776Cln cln2) {
        float f = cln.A00;
        float f2 = cln.A01;
        return (float) BE9.A00(f - cln2.A00, f2 - cln2.A01);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25776Cln) {
            C25776Cln cln = (C25776Cln) obj;
            if (this.A00 == cln.A00 && this.A01 == cln.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0u = BE6.A0u("(");
        A0u.append(this.A00);
        A0u.append(',');
        return AnonymousClass001.A1K(A0u, this.A01);
    }

    public C25776Cln(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
