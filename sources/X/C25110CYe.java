package X;

/* renamed from: X.CYe  reason: case insensitive filesystem */
public final class C25110CYe {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C25110CYe cYe = (C25110CYe) obj;
            if (this.A00 != cYe.A00 || this.A01 != cYe.A01) {
                return false;
            }
            String str = this.A02;
            int length = str.length();
            String str2 = cYe.A02;
            return length == 0 ? str2.length() == 0 : str.equals(str2);
        }
    }

    public C25110CYe(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        AnonymousClass000.A1M(A1a, this.A01);
        return AnonymousClass000.A0P(this.A02, A1a, 2);
    }
}
