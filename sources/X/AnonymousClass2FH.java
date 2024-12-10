package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FH  reason: invalid class name */
public final class AnonymousClass2FH extends AnonymousClass184 {
    public String A00;
    public String A01;

    public AnonymousClass2FH() {
        super(3448, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUnknownStanza {");
        AnonymousClass186.A00(this.A00, "unknownStanzaTag", A10);
        return AnonymousClass184.A0S(this.A01, "unknownStanzaType", A10);
    }
}
