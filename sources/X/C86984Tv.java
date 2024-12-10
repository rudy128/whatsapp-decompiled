package X;

/* renamed from: X.4Tv  reason: invalid class name and case insensitive filesystem */
public final class C86984Tv {
    public final AnonymousClass445 A00;
    public final AnonymousClass206 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86984Tv) {
                C86984Tv r5 = (C86984Tv) obj;
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

    public C86984Tv(AnonymousClass445 r1, AnonymousClass206 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageAndEnforcement(message=");
        A10.append(this.A01);
        A10.append(", enforcement=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
