package X;

/* renamed from: X.8fb  reason: invalid class name */
public final class AnonymousClass8fb extends C21597Aml {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8fb) && this.code == ((AnonymousClass8fb) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public AnonymousClass8fb(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
