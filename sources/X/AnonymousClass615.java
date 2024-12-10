package X;

/* renamed from: X.615  reason: invalid class name */
public final class AnonymousClass615 extends AnonymousClass6UU {
    public final String A00;
    public final boolean A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass615) {
                AnonymousClass615 r5 = (AnonymousClass615) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((C17880vN.A03(this.A00) + this.A02) * 31, this.A01);
    }

    public AnonymousClass615(int i, String str, boolean z) {
        this.A00 = str;
        this.A02 = i;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Named(id=");
        A10.append(this.A00);
        A10.append(", name=");
        A10.append(this.A02);
        A10.append(", enabled=");
        return C17900vP.A0F(A10, this.A01);
    }
}
