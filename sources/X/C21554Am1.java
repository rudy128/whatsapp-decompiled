package X;

/* renamed from: X.Am1  reason: case insensitive filesystem */
public final class C21554Am1 implements AnonymousClass3MT {
    public final double A00;
    public final double A01;

    public /* bridge */ /* synthetic */ Comparable BRH() {
        return Double.valueOf(this.A00);
    }

    public /* bridge */ /* synthetic */ Comparable BZX() {
        return Double.valueOf(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C21554Am1)) {
            return false;
        }
        if (isEmpty() && ((C21554Am1) obj).isEmpty()) {
            return true;
        }
        C21554Am1 am1 = (C21554Am1) obj;
        if (this.A01 == am1.A01 && this.A00 == am1.A00) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1R((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public C21554Am1(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public /* bridge */ /* synthetic */ boolean BFl(Comparable comparable) {
        double A002 = AnonymousClass8BR.A00(comparable);
        if (A002 < this.A01 || A002 > this.A00) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean BhW(Comparable comparable, Comparable comparable2) {
        return C108975cc.A1A((AnonymousClass8BR.A00(comparable) > AnonymousClass8BR.A00(comparable2) ? 1 : (AnonymousClass8BR.A00(comparable) == AnonymousClass8BR.A00(comparable2) ? 0 : -1)));
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (AnonymousClass000.A0I(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("..");
        A10.append(this.A00);
        return A10.toString();
    }
}
