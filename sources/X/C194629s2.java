package X;

/* renamed from: X.9s2  reason: invalid class name and case insensitive filesystem */
public final class C194629s2 {
    public final AnonymousClass99F A00;
    public final AnonymousClass99E A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194629s2) {
                C194629s2 r5 = (C194629s2) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)));
    }

    public C194629s2(AnonymousClass99F r1, AnonymousClass99E r2, String str) {
        C72473Md.A1I(str, r2);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AutoconfParams(serverStartMessage=");
        A10.append(this.A02);
        A10.append(", requestCodeClientMetrics=");
        A10.append(this.A00);
        A10.append(", verifyCodeClientMetrics=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
