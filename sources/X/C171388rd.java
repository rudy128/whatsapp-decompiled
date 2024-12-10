package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rd  reason: invalid class name and case insensitive filesystem */
public final class C171388rd extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;

    public C171388rd() {
        super(5262, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A02);
        r3.CHf(12, this.A03);
        r3.CHf(1, this.A06);
        r3.CHf(10, this.A07);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A08);
        r3.CHf(7, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0E(C108955ca.A0g(), this.A02, A13), this.A03, A13), this.A06);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass8BS.A0U(), this.A07);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A04, A13), this.A05, A13), this.A08, A13), this.A01, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamFlowScreenProgress {");
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
