package X;

/* renamed from: X.9oQ  reason: invalid class name and case insensitive filesystem */
public class C192459oQ {
    public final int A00;
    public final AnonymousClass8pS A01;
    public final String A02;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C192459oQ r6 = (C192459oQ) obj;
                AnonymousClass8pS r2 = this.A01;
                if (r2 == null) {
                    String str = this.A02;
                    if (str == null || this.A00 != r6.A00) {
                        return false;
                    }
                    equals = str.equals(r6.A02);
                } else if (this.A00 != r6.A00) {
                    return false;
                } else {
                    equals = r2.equals(r6.A01);
                }
                return equals;
            }
            return false;
        }
    }

    public C192459oQ(AnonymousClass8pS r1, String str, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = str;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        A1a[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1a, 2);
    }
}
