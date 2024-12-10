package X;

/* renamed from: X.4iz  reason: invalid class name and case insensitive filesystem */
public final class C93444iz implements AnonymousClass5X0 {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93444iz) {
                C93444iz r5 = (C93444iz) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C93444iz(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VisibleWithRes(textResId=");
        A10.append(this.A02);
        A10.append(", iconResId=");
        A10.append(this.A01);
        A10.append(", contentDescription=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
