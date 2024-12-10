package X;

/* renamed from: X.4UG  reason: invalid class name */
public final class AnonymousClass4UG {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UG) {
                AnonymousClass4UG r5 = (AnonymousClass4UG) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, C17880vN.A03(this.A02)) + this.A01.hashCode();
    }

    public AnonymousClass4UG(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAFlow(id=");
        A10.append(this.A02);
        A10.append(", cta=");
        A10.append(this.A00);
        A10.append(", firstScreen=");
        return C17900vP.A0B(this.A01, A10);
    }
}
