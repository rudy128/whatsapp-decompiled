package X;

/* renamed from: X.2ls  reason: invalid class name and case insensitive filesystem */
public final class C59172ls {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59172ls) {
                C59172ls r5 = (C59172ls) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + this.A00;
    }

    public C59172ls(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactInfo(jid=");
        A10.append(this.A01);
        A10.append(", rank=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
