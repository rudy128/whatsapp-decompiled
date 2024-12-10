package X;

/* renamed from: X.36m  reason: invalid class name and case insensitive filesystem */
public final class C692536m implements AnonymousClass229 {
    public final AnonymousClass1D6 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C692536m) && C18070vi.A18(this.A00, ((C692536m) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C692536m(AnonymousClass1D6 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlbumItems(albumItems=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
