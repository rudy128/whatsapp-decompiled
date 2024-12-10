package X;

/* renamed from: X.6qR  reason: invalid class name and case insensitive filesystem */
public final class C134346qR {
    public final AnonymousClass8B2 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134346qR) && C18070vi.A18(this.A00, ((C134346qR) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C134346qR(AnonymousClass8B2 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectedMediaDiff(media=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
