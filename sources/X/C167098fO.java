package X;

/* renamed from: X.8fO  reason: invalid class name and case insensitive filesystem */
public final class C167098fO extends C179969Kp {
    public final C1404571m error;

    public C167098fO(C1404571m r2) {
        C18070vi.A0d(r2, 1);
        this.error = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C167098fO) && C18070vi.A18(this.error, ((C167098fO) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
