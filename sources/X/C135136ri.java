package X;

/* renamed from: X.6ri  reason: invalid class name and case insensitive filesystem */
public final class C135136ri {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135136ri) {
                C135136ri r5 = (C135136ri) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A00, C17880vN.A03(this.A01)), this.A02);
    }

    public C135136ri(String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PageInfo(startCursor=");
        A10.append(this.A01);
        A10.append(", endCursor=");
        A10.append(this.A00);
        A10.append(", hasNextPage=");
        return C17900vP.A0F(A10, this.A02);
    }
}
