package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63Q  reason: invalid class name */
public final class AnonymousClass63Q extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass63Q() {
        super(4510, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(7, this.A00);
        r3.CHf(6, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A08(AnonymousClass184.A09(C17880vN.A0h(), this.A01, A13), this.A00, A13), this.A03, A13), this.A04, A13), this.A05);
        AnonymousClass184.A0X(A13, 4);
        A13.put(C17880vN.A0l(), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAccountSwitchingEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "accountSwitchingAction", A10);
        AnonymousClass186.A00(this.A00, "accountSwitchingIsCompanionFlow", A10);
        AnonymousClass186.A00(this.A03, "accountSwitchingLatencyMs", A10);
        AnonymousClass186.A00(this.A04, "accountSwitchingNumAccounts", A10);
        AnonymousClass186.A00(this.A05, "accountSwitchingNumPendingMessageNotifs", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "accountSwitchingSource", A10);
    }
}
