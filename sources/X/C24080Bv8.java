package X;

/* renamed from: X.Bv8  reason: case insensitive filesystem */
public final class C24080Bv8 extends C24478C5t {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24080Bv8) {
                C24080Bv8 bv8 = (C24080Bv8) obj;
                if (!C18070vi.A18(this.A01, bv8.A01) || !C18070vi.A18(this.A00, bv8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17880vN.A03(this.A01));
    }

    public C24080Bv8(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(previous=");
        A10.append(this.A01);
        A10.append(", current=");
        return C17900vP.A0B(this.A00, A10);
    }
}
