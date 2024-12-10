package X;

/* renamed from: X.2mB  reason: invalid class name and case insensitive filesystem */
public final class C59362mB {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59362mB) {
                C59362mB r8 = (C59362mB) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass000.A0I(this.A00) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdMutationsCountByStateData(appliedCount=");
        A10.append(this.A00);
        A10.append(", orphanCount=");
        A10.append(this.A01);
        A10.append(", unsupportedCount=");
        return C17900vP.A0E(A10, this.A02);
    }
}
