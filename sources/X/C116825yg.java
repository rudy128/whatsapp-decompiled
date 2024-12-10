package X;

/* renamed from: X.5yg  reason: invalid class name and case insensitive filesystem */
public final class C116825yg extends C49652Ri {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C116825yg) && C18070vi.A18(this.A00, ((C116825yg) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C116825yg(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
