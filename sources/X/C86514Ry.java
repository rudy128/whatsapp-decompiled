package X;

/* renamed from: X.4Ry  reason: invalid class name and case insensitive filesystem */
public final class C86514Ry {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C86514Ry)) {
            return false;
        }
        C86514Ry r4 = (C86514Ry) obj;
        return this.A02 == r4.A02 && C18070vi.A18(this.A01, r4.A01) && C18070vi.A18(this.A00, r4.A00);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.A02);
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(this.A00, objArr, 2);
    }

    public C86514Ry(String str, String str2, boolean z) {
        this.A02 = z;
        this.A01 = str == null ? "" : str;
        this.A00 = str2 == null ? "" : str2;
    }
}
