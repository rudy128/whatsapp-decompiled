package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HN  reason: invalid class name */
public final class AnonymousClass2HN extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public String A0K;

    public AnonymousClass2HN() {
        super(3796, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A0K);
        r3.CHf(19, this.A04);
        r3.CHf(21, this.A05);
        r3.CHf(22, this.A06);
        r3.CHf(20, this.A07);
        r3.CHf(23, this.A08);
        r3.CHf(24, this.A09);
        r3.CHf(16, this.A0A);
        r3.CHf(17, this.A0B);
        r3.CHf(6, this.A0C);
        r3.CHf(7, this.A0D);
        r3.CHf(8, this.A0E);
        r3.CHf(10, this.A0F);
        r3.CHf(11, this.A0G);
        r3.CHf(12, this.A0H);
        r3.CHf(14, this.A0I);
        r3.CHf(15, this.A0J);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A01, A13), this.A02, A13), this.A00);
        AnonymousClass184.A0X(A13, 18);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0M(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0L(C17880vN.A0l(), this.A0K, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0D(10, this.A0F, A13), this.A0G, A13), this.A0H);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A0H(14, this.A0I, A13), this.A0J);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationEngagement {");
        AnonymousClass186.A00(this.A03, "avgNotifEngagementT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "groupSizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "groupTypeClient", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        AnonymousClass186.A00(this.A0K, "threadId", A10);
        AnonymousClass186.A00(this.A04, "totalLinkReshareMessageNotifShown", A10);
        AnonymousClass186.A00(this.A05, "totalLinkReshareMessageNotifShownFb", A10);
        AnonymousClass186.A00(this.A06, "totalLinkReshareMessageNotifShownIg", A10);
        AnonymousClass186.A00(this.A07, "totalLinkReshareMessageNotifTapToOpen", A10);
        AnonymousClass186.A00(this.A08, "totalLinkReshareMessageNotifTapToOpenFb", A10);
        AnonymousClass186.A00(this.A09, "totalLinkReshareMessageNotifTapToOpenIg", A10);
        AnonymousClass186.A00(this.A0A, "totalMessageReminderNotifShown", A10);
        AnonymousClass186.A00(this.A0B, "totalMessageReminderNotifTapToOpen", A10);
        AnonymousClass186.A00(this.A0C, "totalNotifMarkAsRead", A10);
        AnonymousClass186.A00(this.A0D, "totalNotifMissedCallVoipCallback", A10);
        AnonymousClass186.A00(this.A0E, "totalNotifMissedCallVoipMessage", A10);
        AnonymousClass186.A00(this.A0F, "totalNotifReply", A10);
        AnonymousClass186.A00(this.A0G, "totalNotifRtcVoipAccept", A10);
        AnonymousClass186.A00(this.A0H, "totalNotifRtcVoipDecline", A10);
        AnonymousClass186.A00(this.A0I, "totalNotifShown", A10);
        return AnonymousClass184.A0S(this.A0J, "totalNotifTapToOpen", A10);
    }
}
