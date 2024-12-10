package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3z0  reason: invalid class name and case insensitive filesystem */
public final class C81293z0 extends AnonymousClass184 {
    public Integer A00;
    public String A01;

    public C81293z0() {
        super(4016, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSettingsSearchTap {");
        AnonymousClass186.A00(this.A01, "tapItemName", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "topLevelParentSetting", A10);
    }
}
