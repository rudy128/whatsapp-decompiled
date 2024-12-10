package X;

/* renamed from: X.6JP  reason: invalid class name */
public final class AnonymousClass6JP extends AnonymousClass6U0 {
    public final C140066zt A00;
    public final AnonymousClass72J A01;

    public AnonymousClass6JP(C140066zt r2, AnonymousClass72J r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JP) {
                AnonymousClass6JP r5 = (AnonymousClass6JP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusGridPager(spec=");
        A10.append(this.A00);
        A10.append(", statusUpdates=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
