package X;

/* renamed from: X.6zd  reason: invalid class name and case insensitive filesystem */
public final class C139906zd {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139906zd) {
                C139906zd r5 = (C139906zd) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C139906zd A00(String str, String str2, int i) {
        return new C139906zd(str, i, str2);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, (C17880vN.A03(this.A01) + this.A00) * 31);
    }

    public C139906zd(String str, int i, String str2) {
        C72473Md.A1I(str, str2);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MLModelHash(name=");
        A10.append(this.A01);
        A10.append(", version=");
        A10.append(this.A00);
        A10.append(", sha256Hash=");
        return C17900vP.A0B(this.A02, A10);
    }
}
