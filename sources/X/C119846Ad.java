package X;

/* renamed from: X.6Ad  reason: invalid class name and case insensitive filesystem */
public final class C119846Ad extends AnonymousClass6SD {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119846Ad) && C18070vi.A18(this.throwable, ((C119846Ad) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C119846Ad(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeliveryError(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
