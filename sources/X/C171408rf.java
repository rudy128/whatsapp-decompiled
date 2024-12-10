package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rf  reason: invalid class name and case insensitive filesystem */
public final class C171408rf extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;

    public C171408rf() {
        super(5134, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(8, this.A00);
        r3.CHf(9, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A08);
        r3.CHf(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A0B(AnonymousClass184.A0A(C17880vN.A0h(), this.A07, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A06, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A09(C17880vN.A0m(), this.A08, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessagingUserJourney {");
        AnonymousClass186.A00(this.A07, "appSessionId", A10);
        AnonymousClass186.A00(this.A00, "isSelfPin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messagingActionType", A10);
        AnonymousClass186.A00(this.A06, "pinInChatExpirySecs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "threadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "uiSurface", A10);
        AnonymousClass186.A00(this.A08, "userJourneyFunnelId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "userRole", A10);
    }
}
