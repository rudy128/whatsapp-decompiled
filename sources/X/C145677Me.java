package X;

/* renamed from: X.7Me  reason: invalid class name and case insensitive filesystem */
public final class C145677Me implements AnonymousClass8BH {
    public final AnonymousClass725 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C145677Me) && C18070vi.A18(this.A00, ((C145677Me) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C145677Me(AnonymousClass725 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ZipFileNotDownloaded(stickerPack=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
