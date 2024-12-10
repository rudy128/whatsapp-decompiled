package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HK  reason: invalid class name */
public final class AnonymousClass2HK extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
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

    public AnonymousClass2HK() {
        super(4476, new C18180vt(1, 10, 10, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A05);
        r3.CHf(12, this.A06);
        r3.CHf(1, this.A00);
        r3.CHf(18, this.A01);
        r3.CHf(13, this.A02);
        r3.CHf(14, this.A07);
        r3.CHf(2, this.A08);
        r3.CHf(3, this.A09);
        r3.CHf(15, this.A0A);
        r3.CHf(4, this.A0B);
        r3.CHf(5, this.A0C);
        r3.CHf(16, this.A0D);
        r3.CHf(19, this.A0E);
        r3.CHf(17, this.A0F);
        r3.CHf(7, this.A0G);
        r3.CHf(8, this.A0H);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0L(AnonymousClass184.A0I(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0H(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0K(AnonymousClass184.A03(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(9, this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F);
        AnonymousClass184.A0X(A13, 6);
        A13.put(AnonymousClass184.A0A(7, this.A0G, A13), this.A0H);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUpdatesTabOpen {");
        AnonymousClass186.A00(this.A03, "channelFollowedCount", A10);
        AnonymousClass186.A00(this.A04, "channelMutedCount", A10);
        AnonymousClass186.A00(this.A05, "channelUnreadCount", A10);
        AnonymousClass186.A00(this.A06, "channelUnreadPostsCount", A10);
        AnonymousClass186.A00(this.A00, "horizontalView", A10);
        AnonymousClass186.A00(this.A01, "isColdStartOpen", A10);
        AnonymousClass186.A00(this.A02, "isUpdatesTab", A10);
        AnonymousClass186.A00(this.A07, "mutedRecentStatusItems", A10);
        AnonymousClass186.A00(this.A08, "mutedStatusItems", A10);
        AnonymousClass186.A00(this.A09, "mutedStatusRows", A10);
        AnonymousClass186.A00(this.A0A, "mutedViewedStatusItems", A10);
        AnonymousClass186.A00(this.A0B, "recentStatusItems", A10);
        AnonymousClass186.A00(this.A0C, "recentStatusRows", A10);
        AnonymousClass186.A00(this.A0D, "statusTilesLoadedCnt", A10);
        AnonymousClass186.A00(this.A0E, "statusTilesNoLoadReqCnt", A10);
        AnonymousClass186.A00(this.A0F, "statusTilesNotLoadedCnt", A10);
        AnonymousClass186.A00(this.A0G, "viewedStatusItems", A10);
        return AnonymousClass184.A0S(this.A0H, "viewedStatusRows", A10);
    }
}
