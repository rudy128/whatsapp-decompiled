package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HG  reason: invalid class name */
public final class AnonymousClass2HG extends AnonymousClass184 {
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
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;

    public AnonymousClass2HG() {
        super(460, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(10, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(5, this.A08);
        r3.CHf(13, this.A04);
        r3.CHf(14, this.A05);
        r3.CHf(15, this.A06);
        r3.CHf(19, this.A0G);
        r3.CHf(1, this.A07);
        r3.CHf(3, this.A09);
        r3.CHf(18, this.A0A);
        r3.CHf(4, this.A00);
        r3.CHf(16, this.A0B);
        r3.CHf(8, this.A01);
        r3.CHf(17, this.A0C);
        r3.CHf(2, this.A0D);
        r3.CHf(7, this.A0E);
        r3.CHf(9, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(10, this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 11);
        A13.put(C17880vN.A0l(), this.A08);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A09(AnonymousClass184.A04(AnonymousClass184.A0J(AnonymousClass184.A0A(AnonymousClass184.A0I(AnonymousClass184.A06(AnonymousClass184.A0K(AnonymousClass184.A05(AnonymousClass184.A03(AnonymousClass184.A0L(AnonymousClass184.A0H(AnonymousClass184.A0G(13, this.A04, A13), this.A05, A13), this.A06, A13), this.A0G, A13), this.A07, A13), this.A09, A13), this.A0A, A13), this.A00, A13), this.A0B, A13), this.A01, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamLogin {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "androidKeystoreState", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "connectionOrigin", A10);
        AnonymousClass186.A00(this.A08, "connectionT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "loginDnsResolver", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "loginIpSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "loginPort", A10);
        AnonymousClass186.A00(this.A0G, "loginResolvedPop", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "loginResult", A10);
        AnonymousClass186.A00(this.A09, "loginT", A10);
        AnonymousClass186.A00(this.A0A, "logoutSessionId", A10);
        AnonymousClass186.A00(this.A00, "longConnect", A10);
        AnonymousClass186.A00(this.A0B, "noiseProtocolVersion", A10);
        AnonymousClass186.A00(this.A01, "passive", A10);
        AnonymousClass186.A00(this.A0C, "pendingAcksCount", A10);
        AnonymousClass186.A00(this.A0D, "retryCount", A10);
        AnonymousClass186.A00(this.A0E, "sequenceStep", A10);
        return AnonymousClass184.A0S(this.A0F, "serverErrorCode", A10);
    }
}
