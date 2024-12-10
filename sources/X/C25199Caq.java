package X;

/* renamed from: X.Caq  reason: case insensitive filesystem */
public final class C25199Caq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25199Caq caq = (C25199Caq) obj;
            if (!(this.A02 == caq.A02 && this.A00 == caq.A00 && this.A01 == caq.A01 && this.A03 == caq.A03)) {
                return false;
            }
        }
        return true;
    }

    public C25199Caq A00(int i) {
        int i2 = i;
        if (this.A02 == i) {
            return this;
        }
        return new C25199Caq(i2, this.A00, this.A03, this.A01);
    }

    public int hashCode() {
        return ((((((527 + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03);
    }

    public C25199Caq(int i, int i2, long j, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }
}
