package X;

public final class BTI extends C3J {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTI) {
                BTI bti = (BTI) obj;
                if (!(this.A00 == bti.A00 && this.A01 == bti.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public BTI(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
