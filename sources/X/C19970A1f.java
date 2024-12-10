package X;

/* renamed from: X.A1f  reason: case insensitive filesystem */
public final class C19970A1f {
    public final boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19970A1f) {
                C19970A1f a1f = (C19970A1f) obj;
                if (!C18070vi.A18(this.A01, a1f.A01) || this.A00 != a1f.A00) {
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

    public C19970A1f(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProfileBizWebsite(website=");
        A10.append(this.A01);
        A10.append(", isValid=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C19970A1f() {
        this("https://", true);
    }
}
