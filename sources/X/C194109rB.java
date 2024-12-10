package X;

/* renamed from: X.9rB  reason: invalid class name and case insensitive filesystem */
public final class C194109rB {
    public final AnonymousClass99E A00;
    public final String A01;

    public C194109rB(AnonymousClass99E r2, String str) {
        C18070vi.A0d(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194109rB) {
                C194109rB r5 = (C194109rB) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifySilentAuthParams(screenType=");
        A10.append(this.A01);
        A10.append(", clientMetrics=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
