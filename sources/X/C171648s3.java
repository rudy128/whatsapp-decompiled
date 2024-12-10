package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s3  reason: invalid class name and case insensitive filesystem */
public final class C171648s3 extends AnonymousClass184 {
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
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;

    public C171648s3() {
        super(4562, new C18180vt(1, 100, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A08);
        r3.CHf(2, this.A09);
        r3.CHf(3, this.A0C);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(13, this.A0D);
        r3.CHf(15, this.A05);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A0A);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A00);
        r3.CHf(11, this.A0B);
        r3.CHf(12, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0H(AnonymousClass184.A0F(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A08, A13), this.A09, A13), this.A0C, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A0D, A13), this.A05, A13), this.A06, A13), this.A0A, A13), this.A07, A13), this.A00, A13), this.A0B, A13), this.A01);
        AnonymousClass184.A0X(A13, 14);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamLoginStageReliability {");
        AnonymousClass186.A00(this.A08, "loginAbsT", A10);
        AnonymousClass186.A00(this.A09, "loginAppStageCounter", A10);
        AnonymousClass186.A00(this.A0C, "loginConnectionAttemptId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "loginDnsResolver", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "loginIpSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "loginPort", A10);
        AnonymousClass186.A00(this.A0D, "loginResolvedPop", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "loginResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "loginStage", A10);
        AnonymousClass186.A00(this.A0A, "loginStageCounter", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "loginStageErrorReason", A10);
        AnonymousClass186.A00(this.A00, "loginStageSuccess", A10);
        AnonymousClass186.A00(this.A0B, "loginStageT", A10);
        return AnonymousClass184.A0S(this.A01, "passive", A10);
    }
}
