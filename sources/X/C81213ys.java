package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3ys  reason: invalid class name and case insensitive filesystem */
public final class C81213ys extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;

    public C81213ys() {
        super(3446, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A03(C17880vN.A0l(), this.A00, A13), this.A01, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDisappearingModeSettingEvents {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "disappearingModeEntryPoint", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "disappearingModeSettingEventName", A10);
    }
}
