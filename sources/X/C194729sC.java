package X;

/* renamed from: X.9sC  reason: invalid class name and case insensitive filesystem */
public final class C194729sC {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194729sC) {
                C194729sC r5 = (C194729sC) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i4 + i;
    }

    public C194729sC(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NetworkState(isConnected=");
        A10.append(this.A00);
        A10.append(", isValidated=");
        A10.append(this.A03);
        A10.append(", isMetered=");
        A10.append(this.A01);
        A10.append(", isNotRoaming=");
        return C17900vP.A0F(A10, this.A02);
    }
}
