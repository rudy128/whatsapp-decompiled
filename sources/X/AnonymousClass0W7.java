package X;

/* renamed from: X.0W7  reason: invalid class name */
public final class AnonymousClass0W7 implements C16340s6 {
    public final float A00;

    public int BBy(int i, int i2) {
        return C22339B3q.A01((((float) (i2 - i)) / 2.0f) * (1.0f + this.A00));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0W7) && Float.compare(this.A00, ((AnonymousClass0W7) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass0W7(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Vertical(bias=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
