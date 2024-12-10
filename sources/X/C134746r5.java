package X;

/* renamed from: X.6r5  reason: invalid class name and case insensitive filesystem */
public final class C134746r5 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134746r5) {
                C134746r5 r5 = (C134746r5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C134746r5(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageDimension(mediaWidth=");
        A10.append(this.A01);
        A10.append(", mediaHeight=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
