package X;

/* renamed from: X.6qo  reason: invalid class name and case insensitive filesystem */
public final class C134576qo {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134576qo) {
                C134576qo r5 = (C134576qo) obj;
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

    public C134576qo(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GradientColors(startColor=");
        A10.append(this.A01);
        A10.append(", endColor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
