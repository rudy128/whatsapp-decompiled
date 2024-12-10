package X;

/* renamed from: X.6Ds  reason: invalid class name and case insensitive filesystem */
public final class C120446Ds extends C123096Tc {
    public final AnonymousClass6UV A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120446Ds) && C18070vi.A18(this.A00, ((C120446Ds) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C120446Ds(AnonymousClass6UV r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarStickerCategory(avatarCategory=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
