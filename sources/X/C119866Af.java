package X;

/* renamed from: X.6Af  reason: invalid class name and case insensitive filesystem */
public final class C119866Af extends AnonymousClass6SD {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119866Af) && C18070vi.A18(this.throwable, ((C119866Af) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C119866Af(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownError(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
