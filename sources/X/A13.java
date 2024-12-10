package X;

public final class A13 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public A13(int i) {
        this(-1, i, 2131168100, 2131168100);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A13)) {
            return false;
        }
        A13 a13 = (A13) obj;
        return this.A02 == a13.A02 && this.A01 == a13.A01;
    }

    public int hashCode() {
        return ((31 + this.A02) * 31) + this.A01;
    }

    public A13(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }
}
