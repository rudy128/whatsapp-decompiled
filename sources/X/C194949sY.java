package X;

/* renamed from: X.9sY  reason: invalid class name and case insensitive filesystem */
public final class C194949sY {
    public final C185899dK A00;
    public final Short A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194949sY) {
                C194949sY r5 = (C194949sY) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, ((AnonymousClass001.A0k(this.A00) * 31) + C17900vP.A00(this.A02)) * 31), this.A03);
    }

    public C194949sY(C185899dK r1, Short sh, String str, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = sh;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsMetadataGraphqlResponse(metadata=");
        A10.append(this.A00);
        A10.append(", errorType=");
        A10.append(this.A02);
        A10.append(", actionId=");
        A10.append(this.A01);
        A10.append(", dropQplMarker=");
        return C17900vP.A0F(A10, this.A03);
    }
}
