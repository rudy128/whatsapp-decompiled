package X;

/* renamed from: X.99a  reason: invalid class name */
public final class AnonymousClass99a extends C180399Mj {
    public final ADN A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass99a) {
                AnonymousClass99a r5 = (AnonymousClass99a) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass0DV.A00(C17880vN.A03(this.A01), this.A02));
    }

    public AnonymousClass99a(ADN adn, String str, boolean z) {
        C72473Md.A1I(str, adn);
        this.A01 = str;
        this.A02 = z;
        this.A00 = adn;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestComplete(codeMethod=");
        A10.append(this.A01);
        A10.append(", showProgress=");
        A10.append(this.A02);
        A10.append(", result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
