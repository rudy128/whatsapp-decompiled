package X;

/* renamed from: X.7HE  reason: invalid class name */
public final class AnonymousClass7HE implements AnonymousClass856 {
    public final AnonymousClass8B2 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7HE) && C18070vi.A18(this.A00, ((AnonymousClass7HE) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass7HE(AnonymousClass8B2 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BubbleResult(media=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
