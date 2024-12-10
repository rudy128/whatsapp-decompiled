package X;

/* renamed from: X.1Oa  reason: invalid class name and case insensitive filesystem */
public class C25391Oa implements Iterable, C18450wR {
    public final int A00;
    public final int A01;
    public final int A02;

    /* renamed from: A03 */
    public AnonymousClass20U iterator() {
        return new AnonymousClass20U(this.A00, this.A01, this.A02);
    }

    public boolean A04() {
        if (!(this instanceof C25411Oc)) {
            int i = this.A02;
            int i2 = this.A00;
            int i3 = this.A01;
            if (i > 0) {
                if (i2 > i3) {
                    return true;
                }
                return false;
            } else if (i2 < i3) {
                return true;
            } else {
                return false;
            }
        } else if (this.A00 > this.A01) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25391Oa)) {
            return false;
        }
        if (A04() && ((C25391Oa) obj).A04()) {
            return true;
        }
        C25391Oa r3 = (C25391Oa) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.A02;
        StringBuilder sb = new StringBuilder();
        int i2 = this.A00;
        if (i > 0) {
            sb.append(i2);
            sb.append("..");
            sb.append(this.A01);
            sb.append(" step ");
        } else {
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(this.A01);
            sb.append(" step ");
            i = -i;
        }
        sb.append(i);
        return sb.toString();
    }

    public C25391Oa(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.A00 = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
            this.A01 = i2;
            this.A02 = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public int hashCode() {
        if (A04()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
