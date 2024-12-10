package X;

/* renamed from: X.CaZ  reason: case insensitive filesystem */
public final class C25183CaZ {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25183CaZ) {
                C25183CaZ caZ = (C25183CaZ) obj;
                if (!(this.A01 == caZ.A01 && this.A00 == caZ.A00 && this.A02 == caZ.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((this.A01 * 31) + this.A00) * 31, this.A02);
    }

    public C25183CaZ(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BidiRun(start=");
        A10.append(this.A01);
        A10.append(", end=");
        A10.append(this.A00);
        A10.append(", isRtl=");
        return C17900vP.A0F(A10, this.A02);
    }
}
