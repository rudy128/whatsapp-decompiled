package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64R  reason: invalid class name */
public final class AnonymousClass64R extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public String A0P;

    public AnonymousClass64R() {
        super(1658, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(34, this.A08);
        r3.CHf(23, this.A00);
        r3.CHf(25, this.A01);
        r3.CHf(29, this.A02);
        r3.CHf(4, this.A09);
        r3.CHf(32, this.A03);
        r3.CHf(17, this.A0P);
        r3.CHf(18, this.A0E);
        r3.CHf(19, this.A04);
        r3.CHf(22, this.A05);
        r3.CHf(30, this.A06);
        r3.CHf(31, this.A0F);
        r3.CHf(14, this.A0G);
        r3.CHf(16, this.A0H);
        r3.CHf(7, this.A0I);
        r3.CHf(5, this.A0J);
        r3.CHf(8, this.A0K);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A0L);
        r3.CHf(3, this.A0A);
        r3.CHf(6, this.A0M);
        r3.CHf(2, this.A0N);
        r3.CHf(11, this.A0B);
        r3.CHf(1, this.A0O);
        r3.CHf(26, this.A0C);
        r3.CHf(27, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 33);
        A13.put(C108975cc.A0U(AnonymousClass184.A0P(34, this.A08, A13), this.A00, A13), this.A01);
        A13.put(AnonymousClass184.A06(29, this.A02, A13), this.A09);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0D(C108975cc.A0S(AnonymousClass184.A08(C108975cc.A0T(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A0I(AnonymousClass184.A0G(C108975cc.A0W(C108975cc.A0V(AnonymousClass184.A0M(AnonymousClass184.A0N(AnonymousClass184.A0O(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(C108955ca.A0j(), this.A03, A13), this.A0P, A13), this.A0E, A13), this.A04, A13), this.A05, A13), (Object) null, A13), (Object) null, A13), this.A06, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A07, A13), this.A0L, A13), this.A0A, A13), this.A0M, A13), this.A0N, A13), this.A0B, A13), this.A0O);
        A13.put(26, this.A0C);
        A13.put(27, this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusItemView {");
        AnonymousClass186.A00(C17900vP.A08(this.A08), "externalSourceDomainType", A10);
        AnonymousClass186.A00(this.A00, "isPosterBiz", A10);
        AnonymousClass186.A00(this.A01, "isPosterInAddressBook", A10);
        AnonymousClass186.A00(this.A02, "isViewedInLandscape", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "mediaType", A10);
        AnonymousClass186.A00(this.A03, "musicBlocked", A10);
        AnonymousClass186.A00(this.A0P, "psaCampaignId", A10);
        AnonymousClass186.A00(this.A0E, "psaCampaignItemIndex", A10);
        AnonymousClass186.A00(this.A04, "psaLinkAvailable", A10);
        AnonymousClass186.A00(this.A05, "psaLinkClick", A10);
        AnonymousClass186.A00(this.A06, "statusContainsMusic", A10);
        AnonymousClass186.A00(this.A0F, "statusItem3sViewCount", A10);
        AnonymousClass186.A00(this.A0G, "statusItemImpressionCount", A10);
        AnonymousClass186.A00(this.A0H, "statusItemIndex", A10);
        AnonymousClass186.A00(this.A0I, "statusItemLength", A10);
        AnonymousClass186.A00(this.A0J, "statusItemLoadTime", A10);
        AnonymousClass186.A00(this.A0K, "statusItemReplied", A10);
        AnonymousClass186.A00(this.A07, "statusItemUnread", A10);
        AnonymousClass186.A00(this.A0L, "statusItemViewCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "statusItemViewResult", A10);
        AnonymousClass186.A00(this.A0M, "statusItemViewTime", A10);
        AnonymousClass186.A00(this.A0N, "statusRowIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "statusRowSection", A10);
        AnonymousClass186.A00(this.A0O, "statusViewerSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "urlStatusClicked", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0D), "urlStatusType", A10);
    }
}
