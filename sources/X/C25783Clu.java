package X;

/* renamed from: X.Clu  reason: case insensitive filesystem */
public final class C25783Clu {
    public static final C25783Clu A02 = new C25783Clu("UNKNOWN", (String) null);
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25783Clu) {
                C25783Clu clu = (C25783Clu) obj;
                if (!C18070vi.A18(this.A00, clu.A00) || !C18070vi.A18(this.A01, clu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + C17900vP.A00(this.A01);
    }

    public String toString() {
        return this.A00;
    }

    public C25783Clu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
