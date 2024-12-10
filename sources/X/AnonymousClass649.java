package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.649  reason: invalid class name */
public final class AnonymousClass649 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public AnonymousClass649() {
        super(2574, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A00);
        r3.CHf(14, this.A07);
        r3.CHf(7, this.A04);
        r3.CHf(13, this.A08);
        r3.CHf(5, this.A05);
        r3.CHf(15, this.A09);
        r3.CHf(4, this.A01);
        r3.CHf(12, this.A02);
        r3.CHf(10, this.A03);
        r3.CHf(8, this.A0A);
        r3.CHf(1, this.A0B);
        r3.CHf(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 11);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass184.A0A(AnonymousClass184.A0C(AnonymousClass184.A0E(AnonymousClass184.A06(AnonymousClass184.A0H(AnonymousClass184.A07(AnonymousClass184.A0F(AnonymousClass184.A09(AnonymousClass184.A0G(C108955ca.A0f(), this.A00, A13), this.A07, A13), this.A04, A13), this.A08, A13), this.A05, A13), this.A09, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A0A, A13), this.A0B, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdLinkDevicePrimary {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdCompanionPlatformType", A10);
        AnonymousClass186.A00(this.A07, "mdCompanionRefHash", A10);
        AnonymousClass186.A00(this.A04, "mdDurationS", A10);
        AnonymousClass186.A00(this.A08, "mdExtraInfo", A10);
        AnonymousClass186.A00(this.A05, "mdLinkDevicePrimaryErrorCode", A10);
        AnonymousClass186.A00(this.A09, "mdLinkDevicePrimaryErrorReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdLinkDevicePrimaryStage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mdLinkPrimaryAccountType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mdPairingMethod", A10);
        AnonymousClass186.A00(this.A0A, "mdRegAttemptId", A10);
        AnonymousClass186.A00(this.A0B, "mdSessionId", A10);
        return AnonymousClass184.A0S(this.A06, "mdTimestampS", A10);
    }
}
