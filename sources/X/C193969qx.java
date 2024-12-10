package X;

/* renamed from: X.9qx  reason: invalid class name and case insensitive filesystem */
public final class C193969qx {
    public AnonymousClass9FM A00 = null;
    public boolean A01 = true;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193969qx) {
                C193969qx r5 = (C193969qx) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0k(this.A00) * 31, this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CacheData(response=");
        A10.append(this.A00);
        A10.append(", isLoading=");
        return C17900vP.A0F(A10, this.A01);
    }
}
