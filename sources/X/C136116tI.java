package X;

/* renamed from: X.6tI  reason: invalid class name and case insensitive filesystem */
public final class C136116tI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136116tI) {
                C136116tI r8 = (C136116tI) obj;
                if (!(this.A02 == r8.A02 && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A05 == r8.A05 && this.A04 == r8.A04 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A03, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A05, ((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31)));
    }

    public C136116tI(int i, int i2, int i3, long j, long j2, long j3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DatePickerData(year=");
        A10.append(this.A02);
        A10.append(", month=");
        A10.append(this.A01);
        A10.append(", day=");
        A10.append(this.A00);
        A10.append(", today=");
        A10.append(this.A05);
        A10.append(", yearStart=");
        A10.append(this.A04);
        A10.append(", yearEnd=");
        return C17900vP.A0E(A10, this.A03);
    }
}
