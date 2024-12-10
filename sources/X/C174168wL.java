package X;

/* renamed from: X.8wL  reason: invalid class name and case insensitive filesystem */
public final class C174168wL extends C174358we {
    public final C183119Wz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174168wL(C183119Wz r2) {
        super(68);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174168wL) && C18070vi.A18(this.A00, ((C174168wL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
