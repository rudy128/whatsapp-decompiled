package X;

/* renamed from: X.9pp  reason: invalid class name and case insensitive filesystem */
public final class C193279pp {
    public final int A00;
    public final String A01;

    public C193279pp(String str, int i) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193279pp) {
                C193279pp r5 = (C193279pp) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WorkGenerationalId(workSpecId=");
        A10.append(this.A01);
        A10.append(", generation=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
