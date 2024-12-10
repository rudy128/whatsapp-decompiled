package X;

/* renamed from: X.BoU  reason: case insensitive filesystem */
public final class C23723BoU extends C23725BoW {
    public final C25187Cad A00;
    public final CO7 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23723BoU) {
                C23723BoU boU = (C23723BoU) obj;
                if (!C18070vi.A18(this.A02, boU.A02) || !C18070vi.A18(this.A00, boU.A00) || !C18070vi.A18(this.A01, boU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23723BoU(C25187Cad cad, CO7 co7, String str) {
        super(co7, str);
        C72473Md.A1I(str, co7);
        this.A02 = str;
        this.A00 = cad;
        this.A01 = co7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseResult(key=");
        A10.append(this.A02);
        A10.append(", result=");
        A10.append(this.A00);
        A10.append(", summary=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
