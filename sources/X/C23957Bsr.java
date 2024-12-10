package X;

/* renamed from: X.Bsr  reason: case insensitive filesystem */
public final class C23957Bsr extends DPI {
    public final DPL A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23957Bsr) && C18070vi.A18(this.A00, ((C23957Bsr) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23957Bsr(DPL dpl) {
        this.A00 = dpl;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Fixed(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
