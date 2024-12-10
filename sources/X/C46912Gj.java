package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gj  reason: invalid class name and case insensitive filesystem */
public final class C46912Gj extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C46912Gj() {
        super(1656, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A07);
        r3.CHf(5, this.A00);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A01);
        r3.CHf(7, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(1, this.A05);
        r3.CHf(2, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A03(AnonymousClass184.A08(AnonymousClass184.A09(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A07(8, this.A07, A13), this.A00, A13), this.A02, A13), this.A01, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusRowView {");
        AnonymousClass186.A00(this.A07, "psaCampaigns", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "statusRowEntryMethod", A10);
        AnonymousClass186.A00(this.A02, "statusRowIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "statusRowSection", A10);
        AnonymousClass186.A00(this.A03, "statusRowUnreadItemCount", A10);
        AnonymousClass186.A00(this.A04, "statusRowViewCount", A10);
        AnonymousClass186.A00(this.A05, "statusSessionId", A10);
        return AnonymousClass184.A0S(this.A06, "statusViewerSessionId", A10);
    }
}
