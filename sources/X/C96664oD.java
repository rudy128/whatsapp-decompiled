package X;

/* renamed from: X.4oD  reason: invalid class name and case insensitive filesystem */
public final class C96664oD implements AnonymousClass5Y3 {
    public final C41761x1 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96664oD) && C18070vi.A18(this.A00, ((C96664oD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C96664oD(C41761x1 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StaticFilterRow(label=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
