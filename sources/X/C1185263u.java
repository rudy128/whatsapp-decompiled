package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63u  reason: invalid class name and case insensitive filesystem */
public final class C1185263u extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public C1185263u() {
        super(5202, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A07);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A08);
        r3.CHf(7, this.A05);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A07, A13), this.A04, A13), this.A02, A13), this.A08, A13), this.A05, A13), this.A03, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChannelSimilarChannels {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "bannerStatus", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "bannerStatusReason", A10);
        AnonymousClass186.A00(this.A07, "cid", A10);
        AnonymousClass186.A00(this.A04, "similarChannelDisplayRank", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "similarChannelEventSurface", A10);
        AnonymousClass186.A00(this.A08, "similarChannelId", A10);
        AnonymousClass186.A00(this.A05, "similarChannelRank", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "similarChannelUserType", A10);
        return AnonymousClass184.A0S(this.A06, "similarChannelsSessionId", A10);
    }
}
