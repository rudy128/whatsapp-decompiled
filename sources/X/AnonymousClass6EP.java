package X;

/* renamed from: X.6EP  reason: invalid class name */
public final class AnonymousClass6EP extends C123146Th {
    public final AnonymousClass725 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6EP) && C18070vi.A18(this.A00, ((AnonymousClass6EP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6EP(AnonymousClass725 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Available(stickerPack=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
