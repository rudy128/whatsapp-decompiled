package X;

/* renamed from: X.2kt  reason: invalid class name and case insensitive filesystem */
public class C58562kt {
    public final AnonymousClass1BI A00;
    public final AnonymousClass1BI A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C58562kt)) {
                return false;
            }
            C58562kt r4 = (C58562kt) obj;
            if (!C42171xk.A00(this.A00, r4.A00) || !C42171xk.A00(this.A01, r4.A01) || this.A02 != r4.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A02), objArr, 2);
    }

    public C58562kt(AnonymousClass1BI r1, AnonymousClass1BI r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }
}
