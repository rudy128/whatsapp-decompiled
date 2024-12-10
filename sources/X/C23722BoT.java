package X;

/* renamed from: X.BoT  reason: case insensitive filesystem */
public final class C23722BoT extends C4E {
    public final Runnable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23722BoT) && C18070vi.A18(this.A00, ((C23722BoT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23722BoT(Runnable runnable) {
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Subscription(cancelToken=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
