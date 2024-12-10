package X;

/* renamed from: X.0K1  reason: invalid class name */
public final class AnonymousClass0K1 {
    public AnonymousClass0QS A00 = null;
    public String A01;
    public boolean A02 = false;
    public final String A03;

    public AnonymousClass0K1(String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0K1) {
                AnonymousClass0K1 r5 = (AnonymousClass0K1) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31, this.A02) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextSubstitutionValue(original=");
        A10.append(this.A03);
        A10.append(", substitution=");
        A10.append(this.A01);
        A10.append(", isShowingSubstitution=");
        A10.append(this.A02);
        A10.append(", layoutCache=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
