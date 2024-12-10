package X;

/* renamed from: X.6JM  reason: invalid class name */
public final class AnonymousClass6JM extends AnonymousClass6U0 {
    public final AnonymousClass1E7 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6JM) && C18070vi.A18(this.A00, ((AnonymousClass6JM) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass6JM(AnonymousClass1E7 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MyStatusHorizontalTileDataItem(contact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
