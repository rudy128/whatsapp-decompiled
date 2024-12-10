package X;

/* renamed from: X.Cal  reason: case insensitive filesystem */
public final class C25194Cal {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25194Cal) {
                C25194Cal cal = (C25194Cal) obj;
                if (!(this.A01 == cal.A01 && this.A03 == cal.A03 && this.A02 == cal.A02 && this.A00 == cal.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public C25194Cal(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IntRect.fromLTRB(");
        A10.append(this.A01);
        A10.append(", ");
        A10.append(this.A03);
        A10.append(", ");
        A10.append(this.A02);
        A10.append(", ");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
