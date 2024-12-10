package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.641  reason: invalid class name */
public final class AnonymousClass641 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass641() {
        super(2978, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A00);
        r3.CHf(10, this.A01);
        r3.CHf(8, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(7, this.A08);
        r3.CHf(4, this.A09);
        r3.CHf(5, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A03(C108975cc.A0T(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0A(AnonymousClass184.A0C(C108955ca.A0f(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A08, A13), this.A09, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusMute {");
        AnonymousClass186.A00(this.A00, "isPosterBiz", A10);
        AnonymousClass186.A00(this.A01, "isPosterInAddressBook", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "muteAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "muteOrigin", A10);
        AnonymousClass186.A00(this.A08, "psaCampaignId", A10);
        AnonymousClass186.A00(this.A09, "psaCampaignIds", A10);
        AnonymousClass186.A00(this.A04, "psaCampaignItemIndex", A10);
        AnonymousClass186.A00(this.A05, "statusItemIndex", A10);
        AnonymousClass186.A00(this.A06, "statusSessionId", A10);
        return AnonymousClass184.A0S(this.A07, "statusViewerSessionId", A10);
    }
}
