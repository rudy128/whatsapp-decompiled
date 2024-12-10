package X;

/* renamed from: X.DuN  reason: case insensitive filesystem */
public final class C28262DuN extends C24444C4e {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28262DuN) {
                C28262DuN duN = (C28262DuN) obj;
                if (!(Float.compare(this.A00, duN.A00) == 0 && Float.compare(this.A01, duN.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public C28262DuN(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Absolute(x=");
        A10.append(this.A00);
        A10.append(", y=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
