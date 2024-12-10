package X;

/* renamed from: X.9pr  reason: invalid class name and case insensitive filesystem */
public final class C193299pr {
    public boolean A00 = false;
    public boolean A01 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193299pr) {
                C193299pr r5 = (C193299pr) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaLinkConfiguration(isEu=");
        A10.append(this.A00);
        A10.append(", isUk=");
        return C17900vP.A0F(A10, this.A01);
    }
}
