package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gr  reason: invalid class name and case insensitive filesystem */
public final class C46992Gr extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C46992Gr() {
        super(1676, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(2, this.A07);
        r3.CHf(9, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A04(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A03(AnonymousClass184.A08(AnonymousClass184.A07(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusDaily {");
        AnonymousClass186.A00(this.A00, "statusAvailableCountDaily", A10);
        AnonymousClass186.A00(this.A01, "statusAvailableMentionCountDaily", A10);
        AnonymousClass186.A00(this.A02, "statusAvailableMentionRowsCountDaily", A10);
        AnonymousClass186.A00(this.A03, "statusAvailableRowsCountDaily", A10);
        AnonymousClass186.A00(this.A04, "statusViewedCountDaily", A10);
        AnonymousClass186.A00(this.A05, "statusViewedMentionCountDaily", A10);
        AnonymousClass186.A00(this.A06, "statusViewedMentionRowsCountDaily", A10);
        AnonymousClass186.A00(this.A07, "statusViewedRowsCountDaily", A10);
        return AnonymousClass184.A0S(this.A08, "statusViewsReceivedDaily", A10);
    }
}
