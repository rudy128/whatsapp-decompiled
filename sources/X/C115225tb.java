package X;

/* renamed from: X.5tb  reason: invalid class name and case insensitive filesystem */
public final class C115225tb extends C147357Sv {
    public final Throwable error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115225tb) && C18070vi.A18(this.error, ((C115225tb) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C115225tb(Throwable th) {
        super(th);
        this.error = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
