package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r2  reason: invalid class name and case insensitive filesystem */
public final class C171018r2 extends AnonymousClass184 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;

    public C171018r2() {
        super(5720, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A00);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C17880vN.A0k(), this.A02);
        AnonymousClass184.A0X(A13, 5);
        A13.put(C17880vN.A0j(), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageUpsellUserJourney {");
        AnonymousClass186.A00(this.A01, "appSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "messageUpsellAction", A10);
        AnonymousClass186.A00(this.A02, "upsellSurface", A10);
        return AnonymousClass184.A0S(this.A03, "userJourneyFunnelId", A10);
    }
}
