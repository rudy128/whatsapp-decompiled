package X;

/* renamed from: X.CaC  reason: case insensitive filesystem */
public final class C25161CaC {
    public final C23191Bcl A00;
    public final C25121CYu A01;

    public /* synthetic */ C25161CaC(C23191Bcl bcl, C25121CYu cYu) {
        this.A01 = cYu;
        this.A00 = bcl;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C25161CaC)) {
            C25161CaC caC = (C25161CaC) obj;
            return C25332Cdd.A01(this.A01, caC.A01) && C25332Cdd.A01(this.A00, caC.A00);
        }
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(this.A00, C17890vO.A1a(this.A01), 1);
    }

    public final String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A01, "key");
        cyh.A00(this.A00, "feature");
        return cyh.toString();
    }
}
