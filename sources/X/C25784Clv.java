package X;

/* renamed from: X.Clv  reason: case insensitive filesystem */
public final class C25784Clv {
    public static final C25784Clv A02 = new C25784Clv(2, false);
    public static final C25784Clv A03 = new C25784Clv(1, true);
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25784Clv) {
                C25784Clv clv = (C25784Clv) obj;
                if (!(this.A00 == clv.A00 && this.A01 == clv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(this.A00 * 31, this.A01);
    }

    public String toString() {
        if (equals(A02)) {
            return "TextMotion.Static";
        }
        if (equals(A03)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public C25784Clv(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
