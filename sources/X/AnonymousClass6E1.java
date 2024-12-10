package X;

/* renamed from: X.6E1  reason: invalid class name */
public final class AnonymousClass6E1 extends C123116Te {
    public final C139726zL A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6E1) && C18070vi.A18(this.A00, ((AnonymousClass6E1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6E1(C139726zL r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoteSticker(stableId=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
