package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8re  reason: invalid class name and case insensitive filesystem */
public final class C171398re extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;

    public C171398re() {
        super(5642, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A06);
        r3.CHf(5, this.A07);
        r3.CHf(7, this.A00);
        r3.CHf(8, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(10, this.A08);
        r3.CHf(11, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A06);
        AnonymousClass184.A0X(A13, 4);
        A13.put(C17880vN.A0l(), this.A07);
        AnonymousClass184.A0X(A13, 6);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(C108955ca.A0e(), this.A00, A13), this.A04, A13), this.A05, A13), this.A08, A13), this.A01, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamFlowScreenProgressMonitoring {");
        AnonymousClass186.A00(this.A02, "analyticsIdSfmIndex", A10);
        AnonymousClass186.A00(this.A03, "analyticsIdSfmZeros", A10);
        AnonymousClass186.A00(this.A06, "destinationScreenName", A10);
        AnonymousClass186.A00(this.A07, "flowScreenProgressFlowId", A10);
        AnonymousClass186.A00(this.A00, "isSuccess", A10);
        AnonymousClass186.A00(this.A04, "sessionSfmIndex", A10);
        AnonymousClass186.A00(this.A05, "sessionSfmZeros", A10);
        AnonymousClass186.A00(this.A08, "sourceScreenName", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "trafficSource", A10);
    }
}
