package X;

/* renamed from: X.Cah  reason: case insensitive filesystem */
public final class C25190Cah {
    public final DPJ A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25190Cah) {
                C25190Cah cah = (C25190Cah) obj;
                if (!C18070vi.A18(this.A01, cah.A01) || !C18070vi.A18(this.A00, cah.A00) || this.A02 != cah.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)), this.A02);
    }

    public C25190Cah(DPJ dpj, String str, boolean z) {
        C18070vi.A0j(str, dpj);
        this.A01 = str;
        this.A00 = dpj;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoFieldWireType(name=");
        A10.append(this.A01);
        A10.append(", of=");
        A10.append(this.A00);
        A10.append(", omittable=");
        return C17900vP.A0F(A10, this.A02);
    }
}
