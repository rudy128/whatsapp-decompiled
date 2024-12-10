package X;

/* renamed from: X.60W  reason: invalid class name */
public final class AnonymousClass60W extends C133376oe {
    public final int A00;
    public final AnonymousClass6UU A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60W) {
                AnonymousClass60W r5 = (AnonymousClass60W) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass3MX.A03(this.A03))) + this.A00;
    }

    public AnonymousClass60W(AnonymousClass6UU r1, String str, int i, boolean z) {
        super(r1);
        this.A03 = z;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CustomIcon(selected=");
        A10.append(this.A03);
        A10.append(", section=");
        A10.append(this.A01);
        A10.append(", contentDescription=");
        A10.append(this.A02);
        A10.append(", trayIconResource=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
