package X;

/* renamed from: X.6DL  reason: invalid class name */
public final class AnonymousClass6DL extends AnonymousClass6SL {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DL) && C18070vi.A18(this.throwable, ((AnonymousClass6DL) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass6DL(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
