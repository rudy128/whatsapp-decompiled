package X;

public final class BR9 extends C3B {
    public final boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BR9) {
                BR9 br9 = (BR9) obj;
                if (!C18070vi.A18(this.A01, br9.A01) || this.A00 != br9.A00) {
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

    public BR9(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGenerationSuccess(requestId=");
        A10.append(this.A01);
        A10.append(", fromCache=");
        return C17900vP.A0F(A10, this.A00);
    }
}
