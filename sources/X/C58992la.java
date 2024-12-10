package X;

/* renamed from: X.2la  reason: invalid class name and case insensitive filesystem */
public final class C58992la {
    public final AnonymousClass25M A00;
    public final C42931yy A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58992la) {
                C58992la r5 = (C58992la) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C58992la(AnonymousClass25M r1, C42931yy r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CombinedDataBundle(dataBundle=");
        A10.append(this.A01);
        A10.append(", asyncDataBundle=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
