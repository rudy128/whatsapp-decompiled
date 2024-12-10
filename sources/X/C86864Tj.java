package X;

/* renamed from: X.4Tj  reason: invalid class name and case insensitive filesystem */
public final class C86864Tj {
    public int A00 = 1;
    public final int A01;

    public C86864Tj(int i) {
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86864Tj) {
                C86864Tj r5 = (C86864Tj) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PositionAndCount(position=");
        A10.append(this.A01);
        A10.append(", count=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
