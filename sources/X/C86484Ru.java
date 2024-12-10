package X;

/* renamed from: X.4Ru  reason: invalid class name and case insensitive filesystem */
public class C86484Ru {
    public final int A00;
    public final AnonymousClass206 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C86484Ru r5 = (C86484Ru) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        AnonymousClass000.A1M(objArr, this.A00);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A02), objArr, 2);
    }

    public C86484Ru(AnonymousClass206 r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }
}
