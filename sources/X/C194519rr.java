package X;

/* renamed from: X.9rr  reason: invalid class name and case insensitive filesystem */
public final class C194519rr {
    public final C1418477e A00;
    public final C1418477e A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194519rr) {
                C194519rr r5 = (C194519rr) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A02)));
    }

    public C194519rr(C1418477e r1, C1418477e r2, String str) {
        this.A02 = str;
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternationalActivationDateRange(credentialId=");
        A10.append(this.A02);
        A10.append(", startTs=");
        A10.append(this.A01);
        A10.append(", endTs=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
