package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62i  reason: invalid class name and case insensitive filesystem */
public final class C1181462i extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C1181462i() {
        super(4550, new C18180vt(1, 20, 200, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPushAction {");
        AnonymousClass186.A00(this.A02, "psaCampaignId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "pushNotificationActionType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "pushSurfaceId", A10);
    }
}
