package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rW  reason: invalid class name and case insensitive filesystem */
public final class C171318rW extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;

    public C171318rW() {
        super(6034, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A06);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A05, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A06, A13), this.A04, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCallInfoUserJourney {");
        AnonymousClass186.A00(this.A05, "appSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callGroupSizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "callSizeType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "callType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "preCallActionType", A10);
        AnonymousClass186.A00(this.A06, "surfaceSessionId", A10);
        AnonymousClass186.A00(this.A04, "userJourneyEventMs", A10);
        return AnonymousClass184.A0S(this.A07, "userJourneyFunnelId", A10);
    }
}
