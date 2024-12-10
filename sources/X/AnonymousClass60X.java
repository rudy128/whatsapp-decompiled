package X;

/* renamed from: X.60X  reason: invalid class name */
public final class AnonymousClass60X extends C133376oe {
    public final AnonymousClass6UU A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60X) {
                AnonymousClass60X r5 = (AnonymousClass60X) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass3MX.A03(this.A03))) + C17900vP.A00(this.A02);
    }

    public AnonymousClass60X(AnonymousClass6UU r1, String str, String str2, boolean z) {
        super(r1);
        this.A03 = z;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Discovery(selected=");
        A10.append(this.A03);
        A10.append(", section=");
        A10.append(this.A00);
        A10.append(", contentDescription=");
        A10.append(this.A01);
        A10.append(", trayIconPath=");
        return C17900vP.A0B(this.A02, A10);
    }
}
