package X;

/* renamed from: X.4SA  reason: invalid class name */
public class AnonymousClass4SA {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SA r5 = (AnonymousClass4SA) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = Boolean.valueOf(this.A02);
        objArr[2] = Boolean.valueOf(this.A03);
        objArr[3] = Boolean.valueOf(this.A04);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A01), objArr, 4);
    }

    public AnonymousClass4SA(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A01 = z4;
    }
}
