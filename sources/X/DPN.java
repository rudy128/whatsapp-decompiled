package X;

public final class DPN implements C28473E2o {
    public final DPI A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DPN) {
                DPN dpn = (DPN) obj;
                if (!C18070vi.A18(this.A00, dpn.A00) || !C18070vi.A18(this.A01, dpn.A01) || this.A02 != dpn.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)), this.A02);
    }

    public DPN(DPI dpi, String str, boolean z) {
        C18070vi.A0j(dpi, str);
        this.A00 = dpi;
        this.A01 = str;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoBlockWireType(of=");
        A10.append(this.A00);
        A10.append(", key=");
        A10.append(this.A01);
        A10.append(", dedupe=");
        return C17900vP.A0F(A10, this.A02);
    }
}
