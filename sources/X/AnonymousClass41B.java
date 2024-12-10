package X;

/* renamed from: X.41B  reason: invalid class name */
public final class AnonymousClass41B extends C83164Eb {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass41B) && this.A00 == ((AnonymousClass41B) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass41B(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StringError(stringResource=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
