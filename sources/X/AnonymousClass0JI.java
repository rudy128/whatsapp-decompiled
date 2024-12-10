package X;

/* renamed from: X.0JI  reason: invalid class name */
public final class AnonymousClass0JI {
    public int A00 = 0;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0JI) && this.A00 == ((AnonymousClass0JI) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeltaCounter(count=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
