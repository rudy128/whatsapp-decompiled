package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rn  reason: invalid class name and case insensitive filesystem */
public final class C171488rn extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;

    public C171488rn() {
        super(5752, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A08);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(10, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(9, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0C(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A08, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass3MY.A0g(), this.A07);
        AnonymousClass184.A0X(A13, 11);
        A13.put(C108955ca.A0f(), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReactionUserJourney {");
        AnonymousClass186.A00(this.A08, "appSessionId", A10);
        AnonymousClass186.A00(this.A00, "messageHasOwnReaction", A10);
        AnonymousClass186.A00(this.A01, "messageHasReaction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messageMediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "messageType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "reactionUserJourneyAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "reactionUserJourneyEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "uiSurface", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "userJourneyChatType", A10);
        return AnonymousClass184.A0S(this.A09, "userJourneyFunnelId", A10);
    }
}
