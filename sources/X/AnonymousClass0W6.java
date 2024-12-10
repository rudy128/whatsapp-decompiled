package X;

/* renamed from: X.0W6  reason: invalid class name */
public final class AnonymousClass0W6 implements C16330s5 {
    public final float A00;

    public int BC0(C24246By4 by4, int i, int i2) {
        float f;
        float f2 = ((float) (i2 - i)) / 2.0f;
        if (by4 == C24246By4.Ltr) {
            f = this.A00;
        } else {
            f = -1.0f * this.A00;
        }
        return C22339B3q.A01(f2 * (1.0f + f));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0W6) && Float.compare(this.A00, ((AnonymousClass0W6) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass0W6(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Horizontal(bias=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
