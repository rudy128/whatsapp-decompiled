package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zE  reason: invalid class name and case insensitive filesystem */
public final class C81433zE extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C81433zE() {
        super(2214, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A04(C17880vN.A0k(), this.A00, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSettingsClick {");
        AnonymousClass186.A00(this.A00, "isBookmarkAppInstalled", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "settingsClickEntryPoint", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "settingsItem", A10);
    }
}
