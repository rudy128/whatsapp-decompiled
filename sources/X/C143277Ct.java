package X;

/* renamed from: X.7Ct  reason: invalid class name and case insensitive filesystem */
public final class C143277Ct implements AnonymousClass8B7 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143277Ct) && this.A00 == ((C143277Ct) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C143277Ct(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorItem(message=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
