package X;

/* renamed from: X.8lt  reason: invalid class name and case insensitive filesystem */
public final class C169558lt extends AnonymousClass9M9 {
    public final AN5 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169558lt) && C18070vi.A18(this.A00, ((C169558lt) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C169558lt(AN5 an5) {
        this.A00 = an5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogSearchPageSuccessResult(catalogPage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
