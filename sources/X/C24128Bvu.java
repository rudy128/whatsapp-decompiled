package X;

/* renamed from: X.Bvu  reason: case insensitive filesystem */
public final class C24128Bvu extends C24885COd {
    public final C25778Clp A00;

    public C24128Bvu(C25778Clp clp) {
        super((C25778Clp) null, clp);
        this.A00 = clp;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24128Bvu) && C18070vi.A18(this.A00, ((C24128Bvu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectResponseVariant(rightIcon=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
