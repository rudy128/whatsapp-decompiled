package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3z9  reason: invalid class name and case insensitive filesystem */
public final class C81383z9 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public C81383z9() {
        super(4526, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEditProfileClick {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "profileAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "profileItem", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "settingsPageType", A10);
    }
}
