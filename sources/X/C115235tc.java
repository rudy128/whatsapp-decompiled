package X;

/* renamed from: X.5tc  reason: invalid class name and case insensitive filesystem */
public final class C115235tc extends C147357Sv {
    public final Throwable error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115235tc) && C18070vi.A18(this.error, ((C115235tc) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C115235tc(Throwable th) {
        super(th);
        this.error = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
