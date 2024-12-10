package X;

/* renamed from: X.41z  reason: invalid class name */
public final class AnonymousClass41z extends C83234Ei {
    public final boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41z) {
                AnonymousClass41z r5 = (AnonymousClass41z) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17880vN.A03(this.A01), this.A00);
    }

    public AnonymousClass41z(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CodeAvailable(verificationCode=");
        A10.append(this.A01);
        A10.append(", canBeConfirmed=");
        return C17900vP.A0F(A10, this.A00);
    }
}
