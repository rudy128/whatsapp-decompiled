package X;

/* renamed from: X.9po  reason: invalid class name and case insensitive filesystem */
public final class C193269po {
    public final Long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193269po) {
                C193269po r5 = (C193269po) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C193269po(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Preference(key=");
        A10.append(this.A01);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
