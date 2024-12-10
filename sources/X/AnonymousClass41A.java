package X;

/* renamed from: X.41A  reason: invalid class name */
public final class AnonymousClass41A extends C83164Eb {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass41A) && this.A00 == ((AnonymousClass41A) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass41A(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProtocolError(error=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
