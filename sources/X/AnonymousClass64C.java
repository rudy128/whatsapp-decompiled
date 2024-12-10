package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64C  reason: invalid class name */
public final class AnonymousClass64C extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(11, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(12, this.A00);
        r3.CHf(13, this.A01);
        r3.CHf(14, this.A0B);
        r3.CHf(9, this.A05);
        r3.CHf(10, this.A06);
        r3.CHf(3, this.A07);
        r3.CHf(4, this.A08);
        r3.CHf(5, this.A09);
        r3.CHf(6, this.A0A);
        r3.CHf(7, this.A0C);
    }

    public AnonymousClass64C() {
        super(4884, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A02);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(C108975cc.A0S(C108955ca.A0g(), this.A03, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A0B, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamConsumerDisclosureEvents {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "consumerDisclosureAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "consumerDisclosureCtaUrlClickState", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "consumerDisclosureEventType", A10);
        AnonymousClass186.A00(this.A00, "consumerDisclosureMessageHasConsentedUrl", A10);
        AnonymousClass186.A00(this.A01, "consumerDisclosureMessageShowDisclosureFlag", A10);
        AnonymousClass186.A00(this.A0B, "consumerDisclosureMessageTemplateId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "consumerDisclosureResultType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "consumerDisclosureServiceAccessType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "consumerDisclosureSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "consumerDisclosureSuppressionReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "consumerDisclosureType", A10);
        AnonymousClass186.A00(this.A0A, "consumerDisclosureVersion", A10);
        return AnonymousClass184.A0S(this.A0C, "threadIdHmac", A10);
    }
}
