package X;

/* renamed from: X.6B4  reason: invalid class name */
public final class AnonymousClass6B4 extends AnonymousClass6TV {
    public final C179619Ir A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B4) {
                AnonymousClass6B4 r5 = (AnonymousClass6B4) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
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

    public AnonymousClass6B4(C179619Ir r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SectionHeaderDataItem(title=");
        A10.append(this.A01);
        A10.append(", category=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
