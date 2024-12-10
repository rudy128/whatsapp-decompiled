package X;

/* renamed from: X.CaV  reason: case insensitive filesystem */
public final class C25179CaV {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25179CaV) {
                C25179CaV caV = (C25179CaV) obj;
                if (!C18070vi.A18(this.A01, caV.A01) || !C18070vi.A18(this.A00, caV.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17900vP.A00(this.A01) * 31);
    }

    public C25179CaV(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorMessage(value=");
        A10.append(this.A01);
        A10.append(", fallbackType=");
        return C17900vP.A0B(this.A00, A10);
    }
}
