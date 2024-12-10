package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rr  reason: invalid class name and case insensitive filesystem */
public final class C171528rr extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A04);
        r3.CHf(2, this.A05);
        r3.CHf(11, this.A06);
        r3.CHf(5, this.A07);
        r3.CHf(6, this.A08);
        r3.CHf(4, this.A00);
        r3.CHf(8, this.A09);
        r3.CHf(9, this.A01);
        r3.CHf(10, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(1, this.A0A);
    }

    public C171528rr() {
        super(3002, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0D(C108975cc.A0S(C17880vN.A0j(), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A09, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageTemplateBlocks {");
        AnonymousClass186.A00(C17900vP.A08(this.A04), "blockEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "blockReason", A10);
        AnonymousClass186.A00(this.A06, "blockReasonIndex", A10);
        AnonymousClass186.A00(this.A07, "businessMessageTime", A10);
        AnonymousClass186.A00(this.A08, "businessPhoneNumber", A10);
        AnonymousClass186.A00(this.A00, "didUserReply", A10);
        AnonymousClass186.A00(this.A09, "eventTimeSec", A10);
        AnonymousClass186.A00(this.A01, "isForcePublished", A10);
        AnonymousClass186.A00(this.A02, "isRandomized", A10);
        AnonymousClass186.A00(this.A03, "isUnsubBlock", A10);
        return AnonymousClass184.A0S(this.A0A, "templateId", A10);
    }
}
