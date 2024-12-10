package X;

/* renamed from: X.60Z  reason: invalid class name */
public final class AnonymousClass60Z extends C133376oe {
    public final int A00;
    public final AnonymousClass6UU A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60Z) {
                AnonymousClass60Z r5 = (AnonymousClass60Z) obj;
                if (this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass3MX.A03(this.A04))) + this.A00) * 31) + C17900vP.A00(this.A03);
    }

    public AnonymousClass60Z(AnonymousClass6UU r1, String str, String str2, int i, boolean z) {
        super(r1);
        this.A04 = z;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Downloading(selected=");
        A10.append(this.A04);
        A10.append(", section=");
        A10.append(this.A01);
        A10.append(", contentDescription=");
        A10.append(this.A02);
        A10.append(", progress=");
        A10.append(this.A00);
        A10.append(", trayIconPath=");
        return C17900vP.A0B(this.A03, A10);
    }
}
