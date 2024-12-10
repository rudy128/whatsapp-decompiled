package X;

/* renamed from: X.9rj  reason: invalid class name and case insensitive filesystem */
public final class C194439rj {
    public final int A00;
    public final C22506BAn A01;
    public final C70513Bj A02;

    public C194439rj(C22506BAn bAn, C70513Bj r3, int i) {
        C18070vi.A0d(r3, 2);
        this.A00 = i;
        this.A02 = r3;
        this.A01 = bAn;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194439rj) {
                C194439rj r5 = (C194439rj) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlertBannerConfiguration(count=");
        A10.append(this.A00);
        A10.append(", alert=");
        A10.append(this.A02);
        A10.append(", onAlertClickListener=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
