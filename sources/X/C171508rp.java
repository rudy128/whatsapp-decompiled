package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rp  reason: invalid class name and case insensitive filesystem */
public final class C171508rp extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public C171508rp() {
        super(4928, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A03);
        r3.CHf(11, this.A04);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A07);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A08);
        r3.CHf(10, this.A09);
        r3.CHf(9, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0C(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A0D(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A03, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A02, A13), this.A08, A13), this.A09, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessSearchRanking {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "actionOnSerp", A10);
        AnonymousClass186.A00(this.A03, "actionOrder", A10);
        AnonymousClass186.A00(this.A04, "businessRankingId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "businessSearchFilterType", A10);
        AnonymousClass186.A00(this.A05, "businessSearchId", A10);
        AnonymousClass186.A00(this.A06, "businessSearchMetadata", A10);
        AnonymousClass186.A00(this.A07, "businessSearchQueryId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "businessSearchResultType", A10);
        AnonymousClass186.A00(this.A08, "businessSearchSessionId", A10);
        AnonymousClass186.A00(this.A09, "searchQuery", A10);
        return AnonymousClass184.A0S(this.A0A, "wabpId", A10);
    }
}
