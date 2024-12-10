package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zc  reason: invalid class name and case insensitive filesystem */
public final class C81673zc extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;

    public C81673zc() {
        super(5336, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A06);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A01);
        r3.CHf(9, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A06, A13), this.A02, A13), this.A00);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A03, A13), this.A04, A13), this.A05, A13), this.A01, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGroupMemberAddingUserJourney {");
        AnonymousClass186.A00(this.A06, "appSessionId", A10);
        AnonymousClass186.A00(this.A02, "frequentlyContactedIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "groupMemberAddingActionType", A10);
        AnonymousClass186.A00(this.A03, "recentlyContactedIndex", A10);
        AnonymousClass186.A00(this.A04, "suggestedContactsCount", A10);
        AnonymousClass186.A00(this.A05, "suggestedContactsIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "uiSurface", A10);
        return AnonymousClass184.A0S(this.A07, "userJourneyFunnelId", A10);
    }
}
