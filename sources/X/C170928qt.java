package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qt  reason: invalid class name and case insensitive filesystem */
public final class C170928qt extends AnonymousClass184 {
    public String A00;
    public String A01;
    public String A02;

    public C170928qt() {
        super(2812, new C18180vt(1, 1, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSamsungBatteryWarning {");
        AnonymousClass186.A00(this.A00, "data", A10);
        AnonymousClass186.A00(this.A01, "extras", A10);
        return AnonymousClass184.A0S(this.A02, "extrasJson", A10);
    }
}
