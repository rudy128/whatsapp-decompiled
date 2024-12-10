package X;

/* renamed from: X.6rq  reason: invalid class name and case insensitive filesystem */
public final class C135216rq {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135216rq) {
                C135216rq r5 = (C135216rq) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public C135216rq(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Category(idRes=");
        A10.append(this.A01);
        A10.append(", nameRes=");
        A10.append(this.A02);
        A10.append(", drawableRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
