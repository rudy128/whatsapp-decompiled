package X;

/* renamed from: X.6D1  reason: invalid class name */
public final class AnonymousClass6D1 extends C123076Ta {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6D1) && C18070vi.A18(this.A00, ((AnonymousClass6D1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6D1(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeliveryError(throwable=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
