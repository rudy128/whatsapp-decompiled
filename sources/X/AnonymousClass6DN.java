package X;

/* renamed from: X.6DN  reason: invalid class name */
public final class AnonymousClass6DN extends AnonymousClass6SL {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DN) && this.code == ((AnonymousClass6DN) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public AnonymousClass6DN(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
