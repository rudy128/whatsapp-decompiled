package X;

/* renamed from: X.3yF  reason: invalid class name and case insensitive filesystem */
public final class C80883yF extends C84914Li {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80883yF) {
                C80883yF r5 = (C80883yF) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C80883yF(String str, int i) {
        super(AnonymousClass00R.A0C);
        this.A01 = str;
        this.A00 = i;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderItem(title=");
        A10.append(this.A01);
        A10.append(", count=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
