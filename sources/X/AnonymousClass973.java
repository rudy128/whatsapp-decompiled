package X;

/* renamed from: X.973  reason: invalid class name */
public final class AnonymousClass973 extends C180039Kw {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass973) && this.code == ((AnonymousClass973) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public AnonymousClass973(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
