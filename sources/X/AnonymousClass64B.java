package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64B  reason: invalid class name */
public final class AnonymousClass64B extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public AnonymousClass64B() {
        super(3008, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(14, this.A0A);
        r3.CHf(8, this.A02);
        r3.CHf(9, this.A03);
        r3.CHf(2, this.A0B);
        r3.CHf(6, this.A0C);
        r3.CHf(13, this.A00);
        r3.CHf(10, this.A01);
        r3.CHf(5, this.A04);
        r3.CHf(12, this.A05);
        r3.CHf(4, this.A08);
        r3.CHf(7, this.A09);
        r3.CHf(1, this.A06);
        r3.CHf(3, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0F(AnonymousClass184.A08(C108975cc.A0S(AnonymousClass184.A0B(AnonymousClass184.A0A(14, this.A0A, A13), this.A02, A13), this.A03, A13), this.A0B, A13), this.A0C, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 11);
        A13.put(C108975cc.A0T(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A0E(C17880vN.A0l(), this.A04, A13), this.A05, A13), this.A08, A13), this.A09, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBizProfileView {");
        AnonymousClass186.A00(this.A0A, "adId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "bizFbSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "bizIgSize", A10);
        AnonymousClass186.A00(this.A0B, "businessProfileJid", A10);
        AnonymousClass186.A00(this.A0C, "catalogSessionId", A10);
        AnonymousClass186.A00(this.A00, "hasCoverPhoto", A10);
        AnonymousClass186.A00(this.A01, "isProfileLinked", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "linkedAccount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "profileEntryPoint", A10);
        AnonymousClass186.A00(this.A08, "scrollDepth", A10);
        AnonymousClass186.A00(this.A09, "sequenceNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "viewBusinessProfileAction", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A07), "websiteSource", A10);
    }
}
