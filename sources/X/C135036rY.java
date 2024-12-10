package X;

/* renamed from: X.6rY  reason: invalid class name and case insensitive filesystem */
public final class C135036rY {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135036rY)) {
            return false;
        }
        C135036rY r4 = (C135036rY) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public C135036rY(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("x");
        return C17880vN.A0t(A10, this.A00);
    }
}
