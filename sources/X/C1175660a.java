package X;

/* renamed from: X.60a  reason: invalid class name and case insensitive filesystem */
public final class C1175660a extends C133376oe {
    public final AnonymousClass6UU A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1175660a) {
                C1175660a r5 = (C1175660a) obj;
                if (this.A04 != r5.A04 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((C17890vO.A02(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass3MX.A03(this.A04))) + C17900vP.A00(this.A02)) * 31, this.A03);
    }

    public C1175660a(AnonymousClass6UU r1, String str, String str2, boolean z, boolean z2) {
        super(r1);
        this.A04 = z;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Installed(selected=");
        A10.append(this.A04);
        A10.append(", section=");
        A10.append(this.A00);
        A10.append(", contentDescription=");
        A10.append(this.A01);
        A10.append(", trayIconPath=");
        A10.append(this.A02);
        A10.append(", isUnseen=");
        return C17900vP.A0F(A10, this.A03);
    }
}
