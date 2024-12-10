package X;

/* renamed from: X.6r4  reason: invalid class name and case insensitive filesystem */
public final class C134736r4 {
    public int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134736r4) {
                C134736r4 r5 = (C134736r4) obj;
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

    public C134736r4(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoSegment(startTSec=");
        A10.append(this.A01);
        A10.append(", endTSec=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
