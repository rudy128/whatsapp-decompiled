package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rq  reason: invalid class name and case insensitive filesystem */
public final class C171518rq extends AnonymousClass184 {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public C171518rq() {
        super(3634, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(10, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A00);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(5, this.A08);
        r3.CHf(6, this.A02);
        r3.CHf(12, this.A09);
        r3.CHf(7, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A0C(C17880vN.A0h(), this.A01, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0E(AnonymousClass184.A08(AnonymousClass184.A07(C108955ca.A0g(), this.A07, A13), this.A08, A13), this.A02, A13), this.A09, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDirectorySearchRanking {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "actionOnBusiness", A10);
        AnonymousClass186.A00(this.A03, "actionOrd", A10);
        AnonymousClass186.A00(this.A04, "businessRankingPosition", A10);
        AnonymousClass186.A00(this.A00, "finalRankingScore", A10);
        AnonymousClass186.A00(this.A05, "nextBizRankingResultId", A10);
        AnonymousClass186.A00(this.A06, "prevBizRankingResultId", A10);
        AnonymousClass186.A00(this.A07, "queryId", A10);
        AnonymousClass186.A00(this.A08, "rankingResultId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "searchEndpoint", A10);
        AnonymousClass186.A00(this.A09, "searchId", A10);
        return AnonymousClass184.A0S(this.A0A, "searchSessionId", A10);
    }
}
