package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gc  reason: invalid class name and case insensitive filesystem */
public final class C46842Gc extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C46842Gc() {
        super(4838, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(C17880vN.A0l(), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUpdatesTabSearch {");
        AnonymousClass186.A00(this.A01, "channelsAdminCount", A10);
        AnonymousClass186.A00(this.A02, "channelsFollowedCount", A10);
        AnonymousClass186.A00(this.A03, "recentStatusItemCount", A10);
        AnonymousClass186.A00(this.A04, "recentStatusRowCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "updateTabSearchEventType", A10);
        AnonymousClass186.A00(this.A05, "viewedStatusItemCount", A10);
        return AnonymousClass184.A0S(this.A06, "viewedStatusRowCount", A10);
    }
}
