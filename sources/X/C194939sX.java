package X;

/* renamed from: X.9sX  reason: invalid class name and case insensitive filesystem */
public final class C194939sX {
    public final Short A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194939sX) {
                C194939sX r5 = (C194939sX) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, (AnonymousClass3MX.A03(this.A02) + C17900vP.A00(this.A01)) * 31), this.A03);
    }

    public C194939sX(Short sh, String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = sh;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsMetadataAssetsGraphqlResponse(isSuccess=");
        A10.append(this.A02);
        A10.append(", errorType=");
        A10.append(this.A01);
        A10.append(", actionId=");
        A10.append(this.A00);
        A10.append(", dropQplMarker=");
        return C17900vP.A0F(A10, this.A03);
    }
}
