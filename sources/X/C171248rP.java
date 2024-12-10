package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rP  reason: invalid class name and case insensitive filesystem */
public final class C171248rP extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public C171248rP() {
        super(5174, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(4, this.A06);
        r3.CHf(5, this.A03);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0S(AnonymousClass184.A03(C17880vN.A0m(), this.A00, A13), this.A01, A13), this.A02, A13), this.A06, A13), this.A03, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamExpressionTrayUserJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "expressionUserJourneyOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "expressionUserJourneyScreen", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "expressionUserJourneyTarget", A10);
        AnonymousClass186.A00(this.A06, "traySessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "userJourneyAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "userJourneyChatType", A10);
        return AnonymousClass184.A0S(this.A05, "userJourneyEventMs", A10);
    }
}
