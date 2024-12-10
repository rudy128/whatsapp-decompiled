package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.648  reason: invalid class name */
public final class AnonymousClass648 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;

    public AnonymousClass648() {
        super(4544, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A05);
        r3.CHf(12, this.A09);
        r3.CHf(1, this.A01);
        r3.CHf(5, this.A06);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A07);
        r3.CHf(6, this.A08);
        r3.CHf(4, this.A0A);
        r3.CHf(8, this.A0B);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(7, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A03(AnonymousClass184.A0E(C108955ca.A0g(), this.A05, A13), this.A09, A13), this.A01, A13), this.A06, A13), this.A02, A13), this.A07);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A06(C17880vN.A0m(), this.A08, A13), this.A0A, A13), this.A0B, A13), this.A03, A13), this.A04, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChannelDirectory {");
        AnonymousClass186.A00(this.A05, "channelCategoryIndex", A10);
        AnonymousClass186.A00(this.A09, "channelCategoryName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "channelDirectoryAction", A10);
        AnonymousClass186.A00(this.A06, "channelDirectoryActionSequenceNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "channelDirectoryEntryPoint", A10);
        AnonymousClass186.A00(this.A07, "channelDirectorySessionId", A10);
        AnonymousClass186.A00(this.A08, "channelIndex", A10);
        AnonymousClass186.A00(this.A0A, "cid", A10);
        AnonymousClass186.A00(this.A0B, "countrySelector", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "impReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "pillSelected", A10);
        return AnonymousClass184.A0S(this.A00, "searchMode", A10);
    }
}
