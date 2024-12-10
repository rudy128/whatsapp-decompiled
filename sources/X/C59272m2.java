package X;

/* renamed from: X.2m2  reason: invalid class name and case insensitive filesystem */
public final class C59272m2 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59272m2) {
                C59272m2 r5 = (C59272m2) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(this.A00 * 31, this.A02), this.A01);
    }

    public C59272m2(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Spec(resId=");
        A10.append(this.A00);
        A10.append(", start=");
        A10.append(this.A02);
        A10.append(", repeat=");
        return C17900vP.A0F(A10, this.A01);
    }
}
