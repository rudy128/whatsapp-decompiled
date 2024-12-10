package X;

/* renamed from: X.6rk  reason: invalid class name and case insensitive filesystem */
public final class C135156rk {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135156rk) {
                C135156rk r5 = (C135156rk) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(this.A01 * 31, this.A02) + this.A00;
    }

    public C135156rk(int i, boolean z, int i2) {
        this.A01 = i;
        this.A02 = z;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GridItemDecorationViewState(spacingRes=");
        A10.append(this.A01);
        A10.append(", isLandscape=");
        A10.append(this.A02);
        A10.append(", includesEdge=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
