package X;

/* renamed from: X.2lc  reason: invalid class name and case insensitive filesystem */
public final class C59012lc {
    public final A2B A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59012lc) {
                C59012lc r5 = (C59012lc) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C59012lc(A2B a2b, boolean z) {
        this.A00 = a2b;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubgroupWithMetadata(subgroup=");
        A10.append(this.A00);
        A10.append(", isHiddenSubgroup=");
        return C17900vP.A0F(A10, this.A01);
    }
}
