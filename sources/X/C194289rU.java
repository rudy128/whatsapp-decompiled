package X;

/* renamed from: X.9rU  reason: invalid class name and case insensitive filesystem */
public final class C194289rU {
    public final AnonymousClass00H A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194289rU) {
                C194289rU r5 = (C194289rU) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A00)) + C17900vP.A00(this.A01);
    }

    public C194289rU(AnonymousClass00H r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Session(appSessionLazy=");
        A10.append(this.A00);
        A10.append(", uuid=");
        A10.append(this.A02);
        A10.append(", funnelId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
