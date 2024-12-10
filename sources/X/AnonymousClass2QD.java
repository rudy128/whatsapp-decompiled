package X;

/* renamed from: X.2QD  reason: invalid class name */
public final class AnonymousClass2QD extends C43151zL {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2QD) && Float.compare(this.A00, ((AnonymousClass2QD) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass2QD(float f) {
        super(2131169497);
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Medium(strokeWidth=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
