package X;

/* renamed from: X.9rA  reason: invalid class name and case insensitive filesystem */
public final class C194099rA {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194099rA) {
                C194099rA r5 = (C194099rA) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public C194099rA(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestEmailOtpParams(showProgress=");
        A10.append(this.A01);
        A10.append(", autoVerification=");
        return C17900vP.A0B(this.A00, A10);
    }
}
