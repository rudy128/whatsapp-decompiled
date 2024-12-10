package X;

/* renamed from: X.8oY  reason: invalid class name */
public final class AnonymousClass8oY extends AnonymousClass9MH {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8oY) && this.A00 == ((AnonymousClass8oY) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass8oY(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(signalType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
