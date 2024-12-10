package X;

/* renamed from: X.Cm3  reason: case insensitive filesystem */
public final class C25791Cm3 {
    public static final C25033CUk A03 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25791Cm3) {
                C25791Cm3 cm3 = (C25791Cm3) obj;
                if (!(this.A02 == cm3.A02 && this.A01 == cm3.A01 && this.A00 == cm3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C25791Cm3(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScreenShareInfo(width=");
        A10.append(this.A02);
        A10.append(", height=");
        A10.append(this.A01);
        A10.append(", dpi=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
