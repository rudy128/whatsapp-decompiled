package X;

/* renamed from: X.6s4  reason: invalid class name and case insensitive filesystem */
public final class C135356s4 {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135356s4) {
                C135356s4 r5 = (C135356s4) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C17900vP.A00(this.A02) * 31) + this.A00) * 31) + C108955ca.A06(this.A01)) * 31) + 1237;
    }

    public C135356s4(String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectoryState(selectedCategoryTitle=");
        A10.append(this.A02);
        A10.append(", category=");
        A10.append(this.A00);
        A10.append(", country=");
        A10.append(this.A01);
        A10.append(", inSearch=");
        return C17900vP.A0F(A10, false);
    }
}
