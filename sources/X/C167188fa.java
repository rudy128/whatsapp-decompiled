package X;

/* renamed from: X.8fa  reason: invalid class name and case insensitive filesystem */
public final class C167188fa extends C21596Amk {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C167188fa) && this.code == ((C167188fa) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    public C167188fa(int i) {
        this.code = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
