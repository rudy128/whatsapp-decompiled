package X;

/* renamed from: X.99b  reason: invalid class name and case insensitive filesystem */
public final class C1775299b extends C180409Mk {
    public final C188779hy A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1775299b) {
                C1775299b r5 = (C1775299b) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public C1775299b(C188779hy r1, String str) {
        C18070vi.A0j(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerificationComplete(codeMethod=");
        A10.append(this.A01);
        A10.append(", result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
