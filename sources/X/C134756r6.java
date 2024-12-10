package X;

/* renamed from: X.6r6  reason: invalid class name and case insensitive filesystem */
public final class C134756r6 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134756r6) {
                C134756r6 r5 = (C134756r6) obj;
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

    public C134756r6(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageUriInformation(width=");
        A10.append(this.A01);
        A10.append(", height=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
