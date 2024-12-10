package X;

/* renamed from: X.6DC  reason: invalid class name */
public final class AnonymousClass6DC extends AnonymousClass6SJ {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DC) && this.code == ((AnonymousClass6DC) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public AnonymousClass6DC(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
