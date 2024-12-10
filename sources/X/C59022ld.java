package X;

/* renamed from: X.2ld  reason: invalid class name and case insensitive filesystem */
public final class C59022ld {
    public final String A00;
    public final String A01;

    public C59022ld(String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59022ld) {
                C59022ld r5 = (C59022ld) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Command(name=");
        A10.append(this.A01);
        A10.append(", description=");
        return C17900vP.A0B(this.A00, A10);
    }
}
