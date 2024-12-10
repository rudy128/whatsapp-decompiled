package X;

/* renamed from: X.9qt  reason: invalid class name and case insensitive filesystem */
public final class C193929qt {
    public final B5O A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193929qt) {
                C193929qt r5 = (C193929qt) obj;
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

    public C193929qt(B5O b5o, String str) {
        C18070vi.A0j(str, b5o);
        this.A01 = str;
        this.A00 = b5o;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreatePasskeyWithPrfResult(responseJson=");
        A10.append(this.A01);
        A10.append(", prfOutput=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
