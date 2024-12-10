package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HA  reason: invalid class name */
public final class AnonymousClass2HA extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public AnonymousClass2HA() {
        super(3546, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(15, this.A05);
        r3.CHf(16, this.A0A);
        r3.CHf(1, this.A06);
        r3.CHf(17, this.A0B);
        r3.CHf(2, this.A07);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(13, this.A08);
        r3.CHf(7, this.A03);
        r3.CHf(12, this.A0C);
        r3.CHf(8, this.A0D);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 14);
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0A(AnonymousClass184.A0E(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A0J(AnonymousClass184.A03(AnonymousClass184.A0I(15, this.A05, A13), this.A0A, A13), this.A06, A13), this.A0B, A13), this.A07, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A08, A13), this.A03, A13), this.A0C, A13), this.A0D, A13), this.A04, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusPosterActions {");
        AnonymousClass186.A00(this.A05, "externalInteractables", A10);
        AnonymousClass186.A00(this.A0A, "externalPackageName", A10);
        AnonymousClass186.A00(this.A06, "retryCount", A10);
        AnonymousClass186.A00(this.A0B, "shareType", A10);
        AnonymousClass186.A00(this.A07, "statusAudienceSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "statusContentSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "statusContentType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "statusCreationEntryPoint", A10);
        AnonymousClass186.A00(this.A08, "statusDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "statusEventType", A10);
        AnonymousClass186.A00(this.A0C, "statusId", A10);
        AnonymousClass186.A00(this.A0D, "statusPostFailureReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "statusPrivacyType", A10);
        return AnonymousClass184.A0S(this.A09, "statusSessionId", A10);
    }
}
