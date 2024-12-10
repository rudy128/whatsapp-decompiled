package X;

/* renamed from: X.6E0  reason: invalid class name */
public final class AnonymousClass6E0 extends C123116Te {
    public final C1418377d A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6E0) && C18070vi.A18(this.A00, ((AnonymousClass6E0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6E0(C1418377d r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnDevice(sticker=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
