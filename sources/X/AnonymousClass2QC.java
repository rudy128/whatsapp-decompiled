package X;

/* renamed from: X.2QC  reason: invalid class name */
public final class AnonymousClass2QC extends C43151zL {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2QC) && Float.compare(this.A00, ((AnonymousClass2QC) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass2QC(float f) {
        super(2131169496);
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Large(strokeWidth=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
