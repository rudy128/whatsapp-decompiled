package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s5  reason: invalid class name and case insensitive filesystem */
public final class C171668s5 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public C171668s5() {
        super(4592, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A07);
        r3.CHf(8, this.A08);
        r3.CHf(9, this.A09);
        r3.CHf(10, this.A0A);
        r3.CHf(11, this.A0B);
        r3.CHf(12, this.A0C);
        r3.CHf(13, this.A01);
        r3.CHf(15, this.A0D);
        r3.CHf(14, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0H(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A06, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A01, A13), this.A0D, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamLogout {");
        AnonymousClass186.A00(this.A06, "appStandbyBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "loginDnsResolver", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "loginIpSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "loginPort", A10);
        AnonymousClass186.A00(this.A00, "logoutIsBatterySaver", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "logoutReason", A10);
        AnonymousClass186.A00(this.A07, "logoutSessionBackgroundMs", A10);
        AnonymousClass186.A00(this.A08, "logoutSessionForegroundMs", A10);
        AnonymousClass186.A00(this.A09, "logoutSessionId", A10);
        AnonymousClass186.A00(this.A0A, "logoutSessionLengthMs", A10);
        AnonymousClass186.A00(this.A0B, "logoutSessionTotalBytesIn", A10);
        AnonymousClass186.A00(this.A0C, "logoutSessionTotalBytesOut", A10);
        AnonymousClass186.A00(this.A01, "passive", A10);
        AnonymousClass186.A00(this.A0D, "passiveModeT", A10);
        return AnonymousClass184.A0S(this.A0E, "pendingAcksCount", A10);
    }
}
