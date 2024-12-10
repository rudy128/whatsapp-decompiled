package X;

public final class BTL extends C3J {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTL) {
                BTL btl = (BTL) obj;
                if (!(this.A00 == btl.A00 && this.A01 == btl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, this.A00 * 31);
    }

    public BTL(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
