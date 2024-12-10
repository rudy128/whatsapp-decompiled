package X;

/* renamed from: X.9s5  reason: invalid class name and case insensitive filesystem */
public final class C194659s5 {
    public final int A00;
    public final String A01;
    public final String A02;

    public C194659s5(String str, String str2, int i) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194659s5) {
                C194659s5 r5 = (C194659s5) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17880vN.A03(this.A01)) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyEmailOtpParams(code=");
        A10.append(this.A01);
        A10.append(", codeMethod=");
        A10.append(this.A02);
        A10.append(", codeEntryMethod=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
