package X;

/* renamed from: X.Bvv  reason: case insensitive filesystem */
public final class C24129Bvv extends C24885COd {
    public final C25778Clp A00;

    public C24129Bvv(C25778Clp clp) {
        super(clp, (C25778Clp) null);
        this.A00 = clp;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24129Bvv) && C18070vi.A18(this.A00, ((C24129Bvv) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SecondaryChipVariant(leftIcon=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
