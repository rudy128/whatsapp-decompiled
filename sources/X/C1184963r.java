package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63r  reason: invalid class name and case insensitive filesystem */
public final class C1184963r extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;

    public C1184963r() {
        super(5402, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(7, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(6, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A09(C17880vN.A0h(), this.A06, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A06(C17880vN.A0j(), this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A0A(C17880vN.A0l(), this.A04, A13), this.A05, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPttMessageUserJourney {");
        AnonymousClass186.A00(this.A06, "appSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "chatbarInitialState", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "pttMessageUserJourneyAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "pttMessageUserJourneyStage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "uiSurface", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "userJourneyChatType", A10);
        AnonymousClass186.A00(this.A05, "userJourneyEventMs", A10);
        return AnonymousClass184.A0S(this.A07, "userJourneyFunnelId", A10);
    }
}
