package X;

/* renamed from: X.6pI  reason: invalid class name */
public class AnonymousClass6pI {
    public final int A00;
    public final int A01;
    public final C133466oo A02;
    public final C133346ob A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6pI r5 = (AnonymousClass6pI) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C42171xk.A00(this.A03, r5.A03) || !C42171xk.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A03;
        return AnonymousClass000.A0P(this.A02, objArr, 3);
    }

    public AnonymousClass6pI(C133466oo r1, C133346ob r2, int i, int i2) {
        this.A01 = i;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i2;
    }
}
