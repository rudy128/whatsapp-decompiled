package X;

/* renamed from: X.4S1  reason: invalid class name */
public class AnonymousClass4S1 {
    public final int A00;
    public final C86494Rv A01;
    public final C54242dp A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4S1 r5 = (AnonymousClass4S1) obj;
            if (this.A03 != r5.A03 || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (((AnonymousClass000.A0L(this.A02) + (this.A03 ? 1 : 0)) * 31) + this.A00) * 31);
    }

    public AnonymousClass4S1(C86494Rv r1, C54242dp r2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = z;
        this.A01 = r1;
        this.A00 = i;
    }
}
