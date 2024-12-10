package X;

/* renamed from: X.CaU  reason: case insensitive filesystem */
public final class C25178CaU {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25178CaU) {
                C25178CaU caU = (C25178CaU) obj;
                if (!(this.A00 == caU.A00 && this.A01 == caU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A00), this.A01);
    }

    public C25178CaU(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserFlowModel(isNewUser=");
        A10.append(this.A00);
        A10.append(", isStyle2=");
        return C17900vP.A0F(A10, this.A01);
    }
}
