package X;

/* renamed from: X.9O2  reason: invalid class name */
public final class AnonymousClass9O2 {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9O2) {
                AnonymousClass9O2 r5 = (AnonymousClass9O2) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(this.A00 * 31, this.A03) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CollectionStatus(reviewStatus=");
        A10.append(this.A00);
        A10.append(", appealable=");
        A10.append(this.A03);
        A10.append(", rejectReason=");
        A10.append(this.A02);
        A10.append(", policyUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
