package X;

/* renamed from: X.4UF  reason: invalid class name */
public final class AnonymousClass4UF {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UF) {
                AnonymousClass4UF r5 = (AnonymousClass4UF) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17880vN.A03(this.A00)) + this.A02.hashCode();
    }

    public AnonymousClass4UF(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAContentSource(id=");
        A10.append(this.A00);
        A10.append(", type=");
        A10.append(this.A01);
        A10.append(", url=");
        return C17900vP.A0B(this.A02, A10);
    }
}
