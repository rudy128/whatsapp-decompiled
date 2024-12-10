package X;

/* renamed from: X.9qz  reason: invalid class name and case insensitive filesystem */
public final class C193989qz {
    public boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193989qz) {
                C193989qz r5 = (C193989qz) obj;
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

    public C193989qz(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StateCacheInfo(stateName=");
        A10.append(this.A01);
        A10.append(", isUIInitialized=");
        return C17900vP.A0F(A10, this.A00);
    }
}
