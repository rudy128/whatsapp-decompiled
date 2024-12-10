package X;

/* renamed from: X.4Dx  reason: invalid class name and case insensitive filesystem */
public final class C83124Dx extends Exception {
    public final int errorCode;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C83124Dx) && this.errorCode == ((C83124Dx) obj).errorCode);
    }

    public int hashCode() {
        return this.errorCode;
    }

    public C83124Dx(int i) {
        this.errorCode = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorCodeException(errorCode=");
        return AnonymousClass001.A1L(A10, this.errorCode);
    }
}
