package X;

/* renamed from: X.60l  reason: invalid class name and case insensitive filesystem */
public final class C1176560l extends C138756xd {
    public final AnonymousClass6UU A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1176560l) && C18070vi.A18(this.A00, ((C1176560l) obj).A00));
    }

    public C1176560l(AnonymousClass6UU r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, 402919098);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPackBrowseMore(id=");
        C138756xd.A02(A10, "id-sticker-pack-browse-more");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
