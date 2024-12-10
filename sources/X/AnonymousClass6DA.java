package X;

/* renamed from: X.6DA  reason: invalid class name */
public final class AnonymousClass6DA extends AnonymousClass6SJ {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DA) && C18070vi.A18(this.throwable, ((AnonymousClass6DA) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass6DA(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
