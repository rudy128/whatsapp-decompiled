package X;

/* renamed from: X.9rg  reason: invalid class name and case insensitive filesystem */
public final class C194409rg {
    public final C193789qf A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194409rg) {
                C194409rg r5 = (C194409rg) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A02) * 31) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C194409rg(C193789qf r1, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventLocation(name=");
        A10.append(this.A02);
        A10.append(", address=");
        A10.append(this.A01);
        A10.append(", locationPoint=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
