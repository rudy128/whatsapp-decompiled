package X;

/* renamed from: X.0K0  reason: invalid class name */
public final class AnonymousClass0K0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0K0)) {
            return false;
        }
        AnonymousClass0K0 r4 = (AnonymousClass0K0) obj;
        return this.A01 == r4.A01 && this.A03 == r4.A03 && this.A02 == r4.A02 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass0K0(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InsetsValues(left=");
        A10.append(this.A01);
        A10.append(", top=");
        A10.append(this.A03);
        A10.append(", right=");
        A10.append(this.A02);
        A10.append(", bottom=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
