package X;

/* renamed from: X.2mD  reason: invalid class name and case insensitive filesystem */
public final class C59382mD {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59382mD) {
                C59382mD r5 = (C59382mD) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public C59382mD(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{videoLimitMb=");
        A10.append(this.A00);
        A10.append(", videoMaxEdge=");
        A10.append(this.A02);
        A10.append(", videoMaxBitrate=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
