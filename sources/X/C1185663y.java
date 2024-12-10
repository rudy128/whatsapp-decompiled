package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63y  reason: invalid class name and case insensitive filesystem */
public final class C1185663y extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C1185663y() {
        super(5766, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A06);
        r3.CHf(7, this.A07);
        r3.CHf(8, this.A00);
        r3.CHf(10, this.A08);
        r3.CHf(11, this.A01);
        r3.CHf(12, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A05, A13), this.A03);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A04, A13), this.A06, A13), this.A07, A13), this.A00);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(10, this.A08, A13), this.A01, A13), this.A09, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChannelDiscoveryVisibilityTracking {");
        AnonymousClass186.A00(this.A02, "channelCategoryIndex", A10);
        AnonymousClass186.A00(this.A05, "channelCategoryName", A10);
        AnonymousClass186.A00(this.A03, "channelDirectorySessionId", A10);
        AnonymousClass186.A00(this.A04, "channelIndex", A10);
        AnonymousClass186.A00(this.A06, "cid", A10);
        AnonymousClass186.A00(this.A07, "countrySelector", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "discoverySurface", A10);
        AnonymousClass186.A00(this.A08, "elementVisibilityPercentage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "pillSelected", A10);
        return AnonymousClass184.A0S(this.A09, "screenVisibilityPercentage", A10);
    }
}
