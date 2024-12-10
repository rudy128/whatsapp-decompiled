package X;

/* renamed from: X.43q  reason: invalid class name and case insensitive filesystem */
public final class C821943q extends C83324Er {
    public final AnonymousClass1E7 A00;

    public C821943q(AnonymousClass1E7 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C821943q) && C18070vi.A18(this.A00, ((C821943q) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InvitedAdmin(waContact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
