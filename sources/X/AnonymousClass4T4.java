package X;

/* renamed from: X.4T4  reason: invalid class name */
public final class AnonymousClass4T4 {
    public final String A00;
    public final boolean A01;

    public AnonymousClass4T4(String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T4) {
                AnonymousClass4T4 r5 = (AnonymousClass4T4) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17880vN.A03(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLinkData(callLinkToken=");
        A10.append(this.A00);
        A10.append(", isVideo=");
        return C17900vP.A0F(A10, this.A01);
    }
}
