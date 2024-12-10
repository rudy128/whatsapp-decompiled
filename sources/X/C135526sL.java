package X;

/* renamed from: X.6sL  reason: invalid class name and case insensitive filesystem */
public final class C135526sL {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135526sL) {
                C135526sL r5 = (C135526sL) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31;
    }

    public C135526sL(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusesRingsState(unseenCount=");
        A10.append(this.A02);
        A10.append(", seenCount=");
        A10.append(this.A00);
        A10.append(", totalCount=");
        A10.append(this.A01);
        A10.append(", failedCount=");
        return AnonymousClass001.A1L(A10, 0);
    }
}
