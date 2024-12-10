package X;

/* renamed from: X.6pR  reason: invalid class name and case insensitive filesystem */
public final class C133756pR {
    public final E8A A00;
    public final AnonymousClass6RV A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        C133756pR r4;
        if (this != obj) {
            if (obj instanceof C133756pR) {
                r4 = (C133756pR) obj;
            } else {
                r4 = null;
            }
            if (r4 == null || !C18070vi.A18(this.A02, r4.A02) || !C18070vi.A18(this.A00, r4.A00) || this.A01 != r4.A01 || this.A03 != r4.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        E8A e8a = this.A00;
        if (e8a != null) {
            i2 = e8a.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        AnonymousClass6RV r0 = this.A01;
        if (r0 != null) {
            i3 = r0.hashCode();
        }
        return C17880vN.A01((i5 + i3) * 31, this.A03);
    }

    public C133756pR(C132716nR r2) {
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A03 = r2.A03;
    }
}
