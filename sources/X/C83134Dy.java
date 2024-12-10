package X;

/* renamed from: X.4Dy  reason: invalid class name and case insensitive filesystem */
public final class C83134Dy extends Exception {
    public final C83044Dd error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C83134Dy) && this.error == ((C83134Dy) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C83134Dy(C83044Dd r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelRequestError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
