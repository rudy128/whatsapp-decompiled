package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fm  reason: invalid class name and case insensitive filesystem */
public final class C46682Fm extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C46682Fm() {
        super(3056, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(1, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A04(AnonymousClass184.A05(C17880vN.A0k(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDisappearingModeSettingChange {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "disappearingModeEntryPoint", A10);
        AnonymousClass186.A00(this.A01, "lastToggleTimestamp", A10);
        AnonymousClass186.A00(this.A02, "newEphemeralityDuration", A10);
        return AnonymousClass184.A0S(this.A03, "previousEphemeralityDuration", A10);
    }
}
