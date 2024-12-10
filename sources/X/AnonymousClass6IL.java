package X;

/* renamed from: X.6IL  reason: invalid class name */
public final class AnonymousClass6IL extends C145697Mg {
    public final AnonymousClass725 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6IL) && C18070vi.A18(this.A00, ((AnonymousClass6IL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6IL(AnonymousClass725 r1) {
        super(r1);
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Retry(stickerPack=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
